package pl.atena.aj.be.music.web.rest;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import pl.atena.aj.be.music.dao.AlbumDAO;

public class MusicWebService implements MusicLibrary {

	@EJB
	private AlbumDAO ad;

    private static Collection<Item> datasource = new ArrayList<>();

    static {
        Album album = new Album();
        album.setId(1);
        album.setName("The Wall");
        
        datasource.add(album);
        
        Artist artist = new Artist();
        artist.setId(1);
        artist.setName("Pink Floyd");
        
        datasource.add(artist);
    }

    @Override
    public Collection<Album> getAlbums() {
        Collection<Album> albums = new ArrayList<>();
        
        for (Item item : datasource) {
            if (item instanceof Album) {
                albums.add((Album) item);
            }
        }

        return albums;
    }

    @Override
    public Collection<Artist> getArtists() {
        Collection<Artist> artists = new ArrayList<>();
        
        for (Item item : datasource) {
            if (item instanceof Artist) {
                artists.add((Artist) item);
            }
        }

        return artists;
    }

    @Override
    public Collection<Item> getItems() {
        return datasource;
    }

    @Override
    public Response getAlbum(int id) {
        Album album = null;

        for (Item item : datasource) {
            if (item instanceof Album) {
                album = (Album) item;
                
                if (album.getId() == id) {
                    return Response.status(200).entity(album).build();
                }
            }
        }

        return Response.status(404).entity("Nie ma takiego albumu").build();
    }

    @Override
    public Album addAlbum(int id, String title) {
        Album album = new Album();
        album.setId(id);
        album.setName(title);
        
        datasource.add(album);
        
        return album;
    }

    @Override
    public Album updateAlbum(int id, String title) {
        Album album = null;
        
        for (Item item : datasource) {
            if (item instanceof Album) {
                album = (Album) item;
                
                if (album.getId() == id) {
                    album.setName(title);
                    
                    return album;
                }
            }
        }
        
        return null;
    }

    @Override
    public Response removeAlbum(int id) {
        Album album = null;

        for (Item item : datasource) {
            if (item instanceof Album) {
                album = (Album) item;
                
                if (album.getId() == id) {
                    datasource.remove(album);
                    
                    return Response.status(200).entity(album).build();
                }
            }
        }
        
        return Response.status(404).entity("Nie albumu o podanym id").build();
    }
}
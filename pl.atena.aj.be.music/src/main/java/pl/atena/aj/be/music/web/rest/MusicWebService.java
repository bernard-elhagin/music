package pl.atena.aj.be.music.web.rest;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

public class MusicWebService implements MusicLibrary {

    private static Collection<Item> datasource = new ArrayList<>();

    @Inject
    private AlbumDAO albumDao;
    
    @Inject
    private ArtistDAO artistDao;
    
    @Override
    public Collection<Item> getAlbums() {
        Collection<Item> albums = new ArrayList<>();
        
        albumDao = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
        
        ArrayList<AlbumDTO> allAlbumsDB = albumDao.getAll();

        for(AlbumDTO a : allAlbumsDB) {
        	Item item = new Item();
        	item.setId(Integer.toString(a.getAlbumId()));
        	item.setName(a.getTitle());
        
        	albums.add(item);
        }

        return albums;
    }

    @Override
    public Collection<Item> getArtists() {
        Collection<Item> artists = new ArrayList<>();
        
        artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
        
        ArrayList<ArtistDTO> allArtistsDB = artistDao.getAll();

        for(ArtistDTO a : allArtistsDB) {
        	Item item = new Item();
        	item.setId(Integer.toString(a.getArtistId()));
        	item.setName(a.getName());
        
        	artists.add(item);
        }

        return artists;
    }

    @Override
    public Collection<Item> getItems() {
        return datasource;
    }

    @Override
    public Response getAlbum(String idString) {
    	int id = Integer.parseInt(idString);
        Item album = new Item();

        albumDao = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
        
        if(albumDao.get(id) != null) {
        	album.setId(idString);
        	album.setName(albumDao.get(id).getTitle());
        	
        	return Response.status(200).entity(album).build();
        }

        return Response.status(404).entity("Nie ma takiego albumu").build();
    }

	@Override
	public Album addAlbum(int id, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album updateAlbum(int id, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response removeAlbum(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
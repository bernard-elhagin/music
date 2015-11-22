package pl.atena.aj.be.music.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.core.Response;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.domain.RESTItem;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

public class MusicService implements ServiceREST {

	private AlbumDAO  albumDao  = new AlbumDAO(AlbumDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
	private ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, MyBatisSQLSessionFactory.getSqlSessionFactory());
    
	private static Collection<RESTItem> albums  = new ArrayList<>();
	private static Collection<RESTItem> artists = new ArrayList<>();
	
	@Override
    public Collection<AlbumDTO> getAlbums() {
        return albumDao.getAll();
    }

    @Override
    public Collection<ArtistDTO> getArtists() {
        return artistDao.getAll();
    }

    @Override
    public Response getAlbum(int id) {
    	return albumDao.get(id);
    }
}

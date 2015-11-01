package pl.atena.aj.be.music;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.dao.TrackDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.domain.Genre;
import pl.atena.aj.be.music.domain.TrackDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

public class MainMusic {

	// private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sqlFactory = MyBatisSQLSessionFactory.getSqlSessionFactory();
		
		AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, sqlFactory);
		TrackDAO trackDao = new TrackDAO(TrackDTO.class, sqlFactory);
		ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, sqlFactory);
		
		AlbumDTO a = new AlbumDTO();
		
		ArtistDTO artist = new ArtistDTO();
		artist.setName("Led Zeppelin");
		
		artistDao.create(artist);
		
		a.setArtist(artist);
		a.setGenre(Genre.ROCK);
		a.setTitle("Led Zeppelin III");

		albumDao.create(a);
		
		System.out.println(a.toString());
	}
}
package pl.atena.aj.be.music;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.dao.GenreDAO;
import pl.atena.aj.be.music.dao.TrackDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;
import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.domain.GenreDTO;
import pl.atena.aj.be.music.domain.TrackDTO;
import pl.atena.aj.be.music.utils.MyBatisSQLSessionFactory;

public class MainMusic {

	// private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sqlFactory = MyBatisSQLSessionFactory.getSqlSessionFactory();
		
		AlbumDAO albumDao = new AlbumDAO(AlbumDTO.class, sqlFactory);
		ArtistDAO artistDao = new ArtistDAO(ArtistDTO.class, sqlFactory);
		GenreDAO genreDao = new GenreDAO(GenreDTO.class, sqlFactory);
		TrackDAO trackDao = new TrackDAO(TrackDTO.class, sqlFactory);
		
		AlbumDTO a = new AlbumDTO();
		
		ArtistDTO art = new ArtistDTO();
		art.setName("King Crimson");
		
		artistDao.create(art);
		
		GenreDTO gen = new GenreDTO();
		gen.setName("Progressive Rock");
		
		genreDao.create(gen);
		
		List<TrackDTO> tracks = new ArrayList<TrackDTO>();
		
		TrackDTO track1 = new TrackDTO();
		track1.setTitle("21st Century Schizoid Man (including 'Mirrors')");
		track1.setLength(1);
		track1.setTrackNumber(1);
		track1.setAlbumId(a.getAlbumId());

		tracks.add(track1);
		
		a.setArtist(art);
		a.setGenre(gen);
		a.setTitle("In the Court of the Crimson King");
		a.setTracks(tracks);
		
		albumDao.create(a);
		
		List<AlbumDTO> albums = albumDao.getAll();
		
		for (AlbumDTO al : albums) {
			System.out.println(al.toString());
		}
	}
}
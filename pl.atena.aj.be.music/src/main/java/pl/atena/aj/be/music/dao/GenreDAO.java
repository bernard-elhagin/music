package pl.atena.aj.be.music.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.ArtistDTO;
import pl.atena.aj.be.music.domain.GenreDTO;

public class GenreDAO extends MyBatisDAO<GenreDTO, Integer> {

	public GenreDAO(Class<GenreDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}
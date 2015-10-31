package pl.atena.aj.be.music.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.ArtistDTO;

public class ArtistDAO extends MyBatisDAO<ArtistDTO, Integer> {

	public ArtistDAO(Class<ArtistDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

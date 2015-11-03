package pl.atena.aj.be.music.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.TrackDTO;

public class TrackDAO extends MyBatisDAO<TrackDTO, Integer> {

	public TrackDAO(Class<TrackDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

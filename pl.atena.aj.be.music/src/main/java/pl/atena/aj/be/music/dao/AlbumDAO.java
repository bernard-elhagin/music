package pl.atena.aj.be.music.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.music.domain.AlbumDTO;

public class AlbumDAO extends MyBatisDAO<AlbumDTO, Integer> {

	public AlbumDAO(Class<AlbumDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

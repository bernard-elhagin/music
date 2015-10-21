package pl.atena.aj.be.ebay.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.ebay.domain.Camera;

public class CameraDAO extends MyBatisDAO<Camera, Integer>{

	public CameraDAO(Class<Camera> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

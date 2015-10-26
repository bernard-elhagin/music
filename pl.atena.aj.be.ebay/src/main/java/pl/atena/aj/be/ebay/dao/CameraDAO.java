package pl.atena.aj.be.ebay.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.ebay.domain.CameraDTO;

public class CameraDAO extends MyBatisDAO<CameraDTO, Integer> {

	public CameraDAO(Class<CameraDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

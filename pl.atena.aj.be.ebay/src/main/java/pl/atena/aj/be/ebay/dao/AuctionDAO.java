package pl.atena.aj.be.ebay.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.ebay.domain.AuctionDTO;

public class AuctionDAO extends MyBatisDAO<AuctionDTO, Integer> {

	public AuctionDAO(Class<AuctionDTO> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

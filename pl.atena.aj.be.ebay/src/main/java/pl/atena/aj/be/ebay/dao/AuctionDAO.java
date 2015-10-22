package pl.atena.aj.be.ebay.dao;

import org.apache.ibatis.session.SqlSessionFactory;

import pl.atena.aj.be.ebay.domain.Auction;

public class AuctionDAO extends MyBatisDAO<Auction, Integer>{

	public AuctionDAO(Class<Auction> type, SqlSessionFactory sqlFactory) {
		super(type, sqlFactory);
	}
}

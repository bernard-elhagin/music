package pl.atena.aj.be.ebay;

import java.util.Date;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.atena.aj.be.ebay.dao.AuctionDAO;
import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.Auction;
import pl.atena.aj.be.ebay.utils.MyBatisSQLSessionFactory;

public class MainEbay {

	private static Logger log = LoggerFactory.getLogger(CameraDAO.class);

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sf = MyBatisSQLSessionFactory.getSqlSessionFactory();
		
		AuctionDAO auctionDao = new AuctionDAO(Auction.class, sf);
		
		Auction auction = new Auction();
		auction.setAuctionId(1);
		auction.setDescription("Nieu¿ywany Canon 7D Mark II w œwietnym stanie.");
		auction.setEndDate(new Date());
		auction.setFinalPrice(1455.65);
		auction.setName("Edziu");
		
//		auctionDao.create(auction);
		
		System.out.println(auctionDao.get(1).toString());
	}
}

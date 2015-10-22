package pl.atena.aj.be.ebay.biz;

import pl.atena.aj.be.ebay.dao.AuctionDAO;
import pl.atena.aj.be.ebay.domain.Auction;

public class AuctionBizBean implements AuctionBiz {

	private AuctionDAO auctionDAO;

	@Override
	public Auction getById(int id) {
		return auctionDAO.get(id);
	}
}

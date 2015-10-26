package pl.atena.aj.be.ebay.biz;

import pl.atena.aj.be.ebay.dao.AuctionDAO;
import pl.atena.aj.be.ebay.domain.AuctionDTO;

public class AuctionBizBean implements AuctionBiz {

	private AuctionDAO auctionDAO;

	public AuctionDTO getById(int id) {
		return auctionDAO.get(id);
	}
}

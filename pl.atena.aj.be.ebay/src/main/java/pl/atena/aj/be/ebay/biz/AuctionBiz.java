package pl.atena.aj.be.ebay.biz;

import pl.atena.aj.be.ebay.domain.AuctionDTO;

public interface AuctionBiz {
	AuctionDTO getById(int id);
}

package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.ArtistDTO;

public class AuctionBizBean implements AuctionBiz {

	private ArtistDAO auctionDAO;

	public ArtistDTO getById(int id) {
		return auctionDAO.get(id);
	}
}

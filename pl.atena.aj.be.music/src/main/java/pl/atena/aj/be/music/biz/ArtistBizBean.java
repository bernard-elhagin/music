package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.dao.ArtistDAO;
import pl.atena.aj.be.music.domain.ArtistDTO;

public class ArtistBizBean implements ArtistBiz {

	private ArtistDAO artistDAO;

	public ArtistDTO getById(int id) {
		return artistDAO.get(id);
	}
}
package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;

public class AlbumBizBean implements AlbumBiz {

	private AlbumDAO albumDAO;

	@Override
	public AlbumDTO getById(int id) {
		return albumDAO.get(id);
	}
}
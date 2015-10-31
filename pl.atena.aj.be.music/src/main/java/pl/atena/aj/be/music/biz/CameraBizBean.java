package pl.atena.aj.be.music.biz;

import pl.atena.aj.be.music.dao.AlbumDAO;
import pl.atena.aj.be.music.domain.AlbumDTO;

public class CameraBizBean implements CameraBiz {

	private AlbumDAO cameraDAO;

	public AlbumDTO getById(int id) {
		return cameraDAO.get(id);
	}
}

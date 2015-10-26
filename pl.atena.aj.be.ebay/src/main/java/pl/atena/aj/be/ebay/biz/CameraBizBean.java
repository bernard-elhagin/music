package pl.atena.aj.be.ebay.biz;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.CameraDTO;

public class CameraBizBean implements CameraBiz {

	private CameraDAO cameraDAO;

	public CameraDTO getById(int id) {
		return cameraDAO.get(id);
	}
}

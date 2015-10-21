package pl.atena.aj.be.ebay.biz;

import pl.atena.aj.be.ebay.dao.CameraDAO;
import pl.atena.aj.be.ebay.domain.Camera;

public class CameraBizBean implements CameraBiz {

	private CameraDAO cameraDAO;

	@Override
	public Camera getById(int id) {
		return cameraDAO.get(id);
	}
}

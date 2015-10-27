package pl.atena.aj.be.ebay.web;

import pl.atena.aj.be.ebay.domain.CameraDTO;

public class CameraAction {
	
	private CameraDTO camera = new CameraDTO();

	public CameraDTO getCamera() {
		return camera;
	}

	public void setCamera(CameraDTO camera) {
		this.camera = camera;
	}
}

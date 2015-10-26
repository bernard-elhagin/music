package pl.atena.aj.be.ebay.domain;

import java.io.Serializable;

public class CameraDTO implements Serializable {

	private static final long serialVersionUID = 4546300624947746982L;
	
	/* ID aparatu w bazie */
	private int cameraId;
	
	/* Marka aparatu */
	private String cameraMake;
	
	/* Model aparatu */
	private String cameraModel;
	
	/* Cena aparatu */
	private double finalPrice;

    public CameraDTO(String cameraMake, String cameraModel, double finalPrice) { 
		this.cameraMake = cameraMake;
		this.cameraModel = cameraModel;
		this.finalPrice = finalPrice;
    }

	public CameraDTO() {
	}

	public void setCameraId(int cameraId) {
    	this.cameraId = cameraId;
	}

	public int getCameraId() {    
		return cameraId;
	}

	public void setCameraMake(String cameraMake) {
    	this.cameraMake = cameraMake;
	}

	public String getCameraMake() {    
		return cameraMake;
	}

	public void setCameraModel(String cameraModel) {
    	this.cameraModel = cameraModel;
	}

	public String getCameraModel() {    
		return cameraModel;
	}

	public void setFinalPrice(double finalPrice) {
    	this.finalPrice = finalPrice;
	}

	public double getFinalPrice() {    
		return finalPrice;
	}

	@Override
	public String toString() {
		return "Camera [cameraId=" + cameraId + ", cameraMake=" + cameraMake + ", cameraModel=" + cameraModel
				+ ", finalPrice=" + finalPrice + "]";
	}
}
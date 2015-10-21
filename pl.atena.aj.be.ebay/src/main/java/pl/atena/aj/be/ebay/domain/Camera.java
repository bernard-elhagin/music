package pl.atena.aj.be.ebay.domain;

public class Camera {

	private int cameraId;
	private String cameraMake;
	private String cameraModel;
	private double finalPrice;

    public Camera(String cameraMake, String cameraModel, double finalPrice) { 
		this.cameraMake = cameraMake;
		this.cameraModel = cameraModel;
		this.finalPrice = finalPrice;
    }

	public Camera() {
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
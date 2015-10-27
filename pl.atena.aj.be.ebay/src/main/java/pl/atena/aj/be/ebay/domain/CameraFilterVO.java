package pl.atena.aj.be.ebay.domain;

import java.io.Serializable;

/**
 * Klasa filtra do wyszukiwania w bazie dla obiektow CameraDTO.
 * 
 * @author bertold
 *
 */
public class CameraFilterVO implements Serializable {

	private static final long serialVersionUID = -7879141950594176957L;

	/* Marka aparatu */
	private String cameraMake;
	
	/* Model aparatu */
	private String cameraModel;
	
	/* Cena aparatu */
	private double finalPrice;

	public String getCameraMake() {
		return cameraMake;
	}

	public void setCameraMake(String cameraMake) {
		this.cameraMake = cameraMake;
	}

	public String getCameraModel() {
		return cameraModel;
	}

	public void setCameraModel(String cameraModel) {
		this.cameraModel = cameraModel;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cameraMake == null) ? 0 : cameraMake.hashCode());
		result = prime * result + ((cameraModel == null) ? 0 : cameraModel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(finalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CameraFilterVO other = (CameraFilterVO) obj;
		if (cameraMake == null) {
			if (other.cameraMake != null)
				return false;
		} else if (!cameraMake.equals(other.cameraMake))
			return false;
		if (cameraModel == null) {
			if (other.cameraModel != null)
				return false;
		} else if (!cameraModel.equals(other.cameraModel))
			return false;
		if (Double.doubleToLongBits(finalPrice) != Double.doubleToLongBits(other.finalPrice))
			return false;
		return true;
	}
}

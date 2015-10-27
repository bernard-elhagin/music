package pl.atena.aj.be.ebay.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Klasa filtra do wyszukiwania w bazie dla obiektow AuctionDTO.
 * 
 * @author bertold
 *
 */
public class AuctionFilterVO implements Serializable {

	private static final long serialVersionUID = -7824562419413623565L;

	/* Nazwa aukcji */
	private String name;
	
	/* Opis aukcji */
	private String description;
	
	/* Data zakoñczenia aukcji */
	private Date endDate;
	
	/* Ostateczna cena przedmiotu */
	private double finalPrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(finalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		AuctionFilterVO other = (AuctionFilterVO) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (Double.doubleToLongBits(finalPrice) != Double.doubleToLongBits(other.finalPrice))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

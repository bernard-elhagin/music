package pl.atena.aj.be.ebay;

import java.util.Date;

public class Auction {
	private int number;
	
	private String description;
	
	private Date endDate;
	
	private double endPrice;

	public Auction(int number, String description, Date endDate, double endPrice) {
		super();
		this.number = number;
		this.description = description;
		this.endDate = endDate;
		this.endPrice = endPrice;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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

	public double getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(double endPrice) {
		this.endPrice = endPrice;
	}

	@Override
	public String toString() {
		return "Auction [number=" + number + ", description=" + description
				+ ", endDate=" + endDate + ", endPrice=" + endPrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(endPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + number;
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
		Auction other = (Auction) obj;
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
		if (Double.doubleToLongBits(endPrice) != Double
				.doubleToLongBits(other.endPrice))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
}

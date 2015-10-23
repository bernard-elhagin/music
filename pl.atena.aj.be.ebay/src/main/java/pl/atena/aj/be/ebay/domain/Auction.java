package pl.atena.aj.be.ebay.domain;

import java.util.Date;

public class Auction {
	
	private int auctionId;
	private String name;
	private String description;
	private Date endDate;
	private double finalPrice;

	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
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
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", name=" + name + ", description=" + description + ", endDate="
				+ endDate + ", finalPrice=" + finalPrice + "]";
	}
}

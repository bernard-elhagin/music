package pl.atena.aj.be.ebay.domain;

import java.io.Serializable;
import java.util.Date;

public class AuctionDTO implements Serializable {
	
	private static final long serialVersionUID = -8764908227192375066L;

	/* ID aukcji w bazie */
	private int auctionId;
	
	/* Nazwa aukcji */
	private String name;
	
	/* Opis aukcji */
	private String description;
	
	/* Data zakoñczenia aukcji */
	private Date endDate;
	
	/* Ostateczna cena przedmiotu */
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
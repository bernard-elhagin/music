package pl.atena.aj.be.ebay;

import java.util.ArrayList;
import java.util.List;

public class Album {
	private List<Auction> album = new ArrayList<Auction>();
	
	public void addItem(Auction auction) {
		this.album.add(auction);
	}
	
	public void removeItem(Auction auction) {
		this.album.remove(auction);
	}
	
	public void displayContents() {
		for (Auction auction : this.album) {
			System.out.println(auction.toString());
			System.out.println("-------------------");
		}
	}
}

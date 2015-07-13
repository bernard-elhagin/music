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
}

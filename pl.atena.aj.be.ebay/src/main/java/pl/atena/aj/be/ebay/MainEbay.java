package pl.atena.aj.be.ebay;

import java.util.Date;

public class MainEbay {

	public static void main(String[] args) {
		Album album = new Album();
		
		Auction a1 = new Auction(1, "przedmiot 1", new Date(), 59.99);
		Auction a2 = new Auction(2, "przedmiot 2", new Date(), 199.99);
		
		album.addItem(a1);
		album.addItem(a2);

	}

}

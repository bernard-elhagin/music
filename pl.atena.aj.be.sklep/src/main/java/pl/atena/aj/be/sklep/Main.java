package pl.atena.aj.be.sklep;

public class Main {

	public static void main(String[] args) {
		Shop shop = new Shop();
		
		Article rower = new Article(3, "Rower", 799.00, "Fajny rower");
		
		Shop.Order order = shop.new Order(5, rower);
		order.accept();
		
		System.out.println(shop.toString());
	}
}

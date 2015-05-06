package pl.atena.aj.be.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ShopTest {

	@Test
	public void testOrderAccept() {
		Shop shop = new Shop();
		
		Article rower = new Article(3, "Rower", 799.00, "Fajny rower");
		
		Shop.Order order = shop.new Order(5, rower);
		order.accept();

		assertThat(shop.getInventory().size()).isEqualTo(5);
	}
}

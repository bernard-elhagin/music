package pl.atena.aj.be.zad11;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Zad11Test {

	@Test
	public void testOrderStatusValue() {
		assertThat(OrderStatus.Active.toString()).isEqualTo("Active");
	}
	
	@Test
	public void testReturnOrderStatus1() {
		Zad11 z11 = new Zad11();
		
		assertThat(z11.returnOrderStatus(OrderStatus.Rejected)).isEqualTo("Kontakt!");
	}

	@Test
	public void testReturnOrderStatus2() {
		Zad11 z11 = new Zad11();
		
		assertThat(z11.returnOrderStatus(OrderStatus.Active)).isEqualTo("Pilne!");
	}
	
	@Test
	public void testReturnOrderStatus3() {
		Zad11 z11 = new Zad11();
		
		assertThat(z11.returnOrderStatus(OrderStatus.Sent)).isEqualTo("Sent");
	}

	@Test
	public void testReturnOrderStatusFalse() {
		Zad11 z11 = new Zad11();
		
		assertThat(z11.returnOrderStatus(OrderStatus.New)).isNotEqualTo("Pilne!");
	}
}

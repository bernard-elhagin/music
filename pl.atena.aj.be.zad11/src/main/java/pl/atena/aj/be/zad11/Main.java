package pl.atena.aj.be.zad11;

public class Main {

	public static void main(String[] args) {
		Zad11 z11 = new Zad11();

		/*
		 * Bez konwersji Active i Rejected
		 */
		for (OrderStatus os : OrderStatus.values()) {
			System.out.println(os.toString());
		}
		
		/*
		 * Z u¿yciem konwersji Active i Rejected
		 */
		for (OrderStatus os : OrderStatus.values()) {
			z11.displayOrderStatus(os);
		}
	}
}

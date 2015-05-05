package pl.atena.aj.be.zad11;

public class Zad11 {
	
	public void displayOrderStatus(OrderStatus os) {
		System.out.println(returnOrderStatus(os));
	}
	
	public String returnOrderStatus(OrderStatus os) {
		String output = "";
		
		switch (os) {
		case Active:
			output = "Pilne!";
			break;
		case Rejected:
			output = "Kontakt!";
			break;
		default:
			output = os.toString();
			break;
		}
		
		return output;
	}
}

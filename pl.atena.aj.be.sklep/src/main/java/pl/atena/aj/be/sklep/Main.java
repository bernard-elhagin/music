package pl.atena.aj.be.sklep;

public class Main {

	public static void main(String[] args) {
		Article art = new Article();
		
		art.setID(0);
		art.setPrice(15.99);
		art.setName("Nazwa1");
		art.setDescription("Opis nazwa1");
		
		System.out.println(art.toString());
	}

}

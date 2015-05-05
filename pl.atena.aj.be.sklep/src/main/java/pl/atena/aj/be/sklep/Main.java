package pl.atena.aj.be.sklep;

public class Main {

	public static void main(String[] args) {
		Article art1 = new Article();

		System.out.println(art1.toString());
		
		Article art2 = new Article(1, "art2", 67.89, "artyku³ 2");

		System.out.println(art2.toString());
	}
}

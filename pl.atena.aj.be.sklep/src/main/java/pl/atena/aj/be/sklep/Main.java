package pl.atena.aj.be.sklep;

public class Main {

	public static void main(String[] args) {

//		Article art = new Book();
//		
//		System.out.println(art.toString()); //toString() z Book
		
//		Book book = new Article(); // B³ad
		
//		Article art = new Article();
//		Book book = (Book) art; // ClassCastException
		
		Book book = new Book();
		Article art = new Article();
		
		art = (Article) book; // Poprawnie.
		System.out.println(book.toString());
	}
}

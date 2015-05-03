package pl.atena.aj.be.zad8;

public class Main {

	public static void main(String[] args) {
		Zad8 z8 = new Zad8();
		
		String[][] tablica = z8.construct2DTable(args, args.length);
		
		z8.display2DTable(tablica);
	}


}

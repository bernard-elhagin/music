package pl.atena.aj.be.zad8;

public class Main {

	public static void main(String[] args) {
		Zad8 z8 = new Zad8();
		
		Double[][] d = {
				{ 99.44, 33.899 }, { 9484.0033, 43837.09 } };
		
		z8.display2DArray(d);

		String[][] s = {
				{ "ddd", "dddddd" }, { "eee", "eeeeee" } };

		z8.display2DArray(s);
	}

}

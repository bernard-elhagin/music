package pl.atena.aj.be.zad5;

public class Zad5 {
	private String[] tablica = { "one", "two", "three", "four", "five" };
	
	public String returnTablicaWithFor() {

		String result = "";
		
		for (int i = 0; i < tablica.length; i++) {
			result += " " + tablica[i];
		}
		
		return result;
	}
	
	public String returnTablicaWithForeach() {

		String result = "";
		
		for (String string : tablica) {
			result += " " + string;
		}
		
		return result;
	}
	
	public String returnTablicaWithWhile() {
		
		String result = "";
		
		int i = 0;
		while (i < tablica.length) {
			result += " " + tablica[i++];
		}
		
		return result;
	}
}

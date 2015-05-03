package pl.atena.aj.be.zad7;

public class Zad7 {

	private int[] tablica = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
	
	private int x;
	
	public Zad7(int x) {
		this.x = x;
	}
	
	public int hasDivByXWithFor() {
		for (int i = 0; i < tablica.length; i++) {
			if( tablica[i] % x == 0 ) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int hasDivByXWithWhile() {
		int index = 0;
		
		while(index < tablica.length) {
			if(tablica[index] % x == 0) {
				return index;
			}
			
			index++;
		}
		
		return -1;
	}
}

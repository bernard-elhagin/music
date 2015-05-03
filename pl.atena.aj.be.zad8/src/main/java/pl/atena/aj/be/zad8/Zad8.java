package pl.atena.aj.be.zad8;

public class Zad8 {

	public <E> void display2DTable(E[][] list) {
		System.out.println(return2DTable(list));
	}
	
	public <E> String return2DTable(E[][] list) {
		
		String result = "";
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				result += list[i][j] + " ";
			}
			result += "\n";
		}
		
		return result;
	}
	
	public String[][] construct2DTable(String[] args, int size1) {
		String[][] tablica = new String[size1][];
		
		for (int i = 0; i < size1; i++) {
			int size2 = Integer.valueOf(args[i]);

			String[] tab = new String[size2];
			
			for (int j = 0; j < size2; j++) {
				tab[j] = i + "-" + j;
			}

			tablica[i] = tab;
		}
		return tablica;
	}
}

package pl.atena.aj.be.zad10;

public class Main {

	public static void main(String[] args) {
		Zad10 z10 = new Zad10();
		
		int[][] in = {
				{1, 2, 1, 2},
				{2, 1, 2, 2},
		};

		String[] actions = {"+", "/", "-", "*"};
		
		int[] processTable = z10.processTable(in, actions);
		for(int i = 0; i < processTable.length; i++) {
			System.out.println(processTable[i]);
		}
	}

}

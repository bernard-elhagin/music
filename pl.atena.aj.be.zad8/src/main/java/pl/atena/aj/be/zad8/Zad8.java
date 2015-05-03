package pl.atena.aj.be.zad8;

public class Zad8 {

	public <E> void display2DArray(E[][] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

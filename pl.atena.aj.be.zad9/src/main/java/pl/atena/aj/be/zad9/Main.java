package pl.atena.aj.be.zad9;

import pl.atena.aj.be.zad8.*;

public class Main {

	public static void main(String[] args) {
		Zad9 z9 = new Zad9();
		Zad8 z8 = new Zad8();
		
		Integer[][] table = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				{13, 14, 15}
		};
		
		System.out.println("Przed:");
		z8.display2DTable(table);
		
		System.out.println("Po:");
		z9.swapRows(table, 1, 2);
		
		z8.display2DTable(table);
	}

}

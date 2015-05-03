package pl.atena.aj.be.zad5;

public class Main {

	public static void main(String[] args) {
		Zad5 z5 = new Zad5();
		
		System.out.println("for:");
		System.out.println(z5.returnTablicaWithFor());
		printLine();
		
		System.out.println("foreach:");
		System.out.println(z5.returnTablicaWithForeach());
		printLine();
		
		System.out.println("while:");
		System.out.println(z5.returnTablicaWithWhile());
		printLine();
		
	}

	private static void printLine() {
		System.out.println("------------");
	}
}

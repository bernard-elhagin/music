package pl.atena.aj.be.zad7;

public class Main {

	public static void main(String[] args) {
		int parseInt = Integer.parseInt(args[0]);

		Zad7 z7 = new Zad7(parseInt);

		System.out.println(args[0] + ": " + z7.hasDivByXWithFor());
	}

}

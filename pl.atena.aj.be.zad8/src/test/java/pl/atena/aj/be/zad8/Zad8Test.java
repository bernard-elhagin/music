package pl.atena.aj.be.zad8;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Zad8Test {

	@Test
	public void testZad8() {
		Zad8 z8 = new Zad8();
		
		String expected = "0-0 0-1 \n1-0 1-1 1-2 1-3 \n2-0 2-1 2-2 \n";
		
		String[] args = { "2", "4", "3" };
	
		String[][] tablica = z8.construct2DTable(args, args.length);

		assertThat(z8.return2DTable(tablica).equals(expected)).isTrue();
	}

}

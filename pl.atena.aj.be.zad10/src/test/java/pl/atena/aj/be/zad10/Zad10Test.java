package pl.atena.aj.be.zad10;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Zad10Test {

	@Test
	public void testCorrect() {
		Zad10 z10 = new Zad10();

		int[][] in = { { 1, 2, 1, 2 }, { 2, 1, 2, 2 }, };

		String[] actions = { "+", "/", "-", "*" };

		int[] processTable = z10.processTable(in, actions);
		int[] expected = { 3, 2, -1, 4 };
		
		assertThat(processTable).isEqualTo(expected);
	}
}

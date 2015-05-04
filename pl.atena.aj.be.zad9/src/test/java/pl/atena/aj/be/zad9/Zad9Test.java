package pl.atena.aj.be.zad9;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

import pl.atena.aj.be.zad8.Zad8;

public class Zad9Test {
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void testOutOfBounds() {
		Zad9 z9 = new Zad9();
		
		Integer[][] table = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				{13, 14, 15}
		};

		exceptionRule.expect(IndexOutOfBoundsException.class);
		z9.swapRows(table, 1, 5);
	}
	
	@Test
	public void testSwapRows() {
		Zad9 z9 = new Zad9();
		
		Integer[][] table = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				{13, 14, 15}
		};

		z9.swapRows(table, 1, 3);
		String expected = "1 2 3 \n10 11 12 \n7 8 9 \n4 5 6 \n13 14 15 \n";
		
		Zad8 z8 = new Zad8();
		
		assertThat(z8.return2DTable(table)).isEqualTo(expected);
	}
}

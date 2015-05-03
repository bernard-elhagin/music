package pl.atena.aj.be.zad5;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Zad5Test {

	@Test
	public void test1() {
		Zad5 z5 = new Zad5();
		
		String resultFromFor = z5.returnTablicaWithFor();
		String resultFromForeach = z5.returnTablicaWithForeach();
		String resultFromWhile = z5.returnTablicaWithWhile();
		
		assertThat(resultFromFor).isEqualTo(resultFromForeach);
		assertThat(resultFromForeach).isEqualTo(resultFromWhile);
	}
}

package pl.atena.aj.be.zad7;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Zad7Test {

	@Test
	public void testDivX5For() {
		Zad7 z7 = new Zad7(5);
		
		assertThat(z7.hasDivByXWithFor() == 4).isTrue();
	}
	
	@Test
	public void testDivX5While() {
		Zad7 z7 = new Zad7(5);
		
		assertThat(z7.hasDivByXWithWhile() == 4).isTrue();
	}
	
	@Test
	public void testDivX7ForFailed() {
		Zad7 z7 = new Zad7(7);
		
		assertThat(z7.hasDivByXWithWhile() != 6).isFalse();
	}
}

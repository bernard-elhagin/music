package pl.atena.aj.be.zad6;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Zad6Test {

	@Test
	public void testGetMin() {
		Zad6 z6 = new Zad6();
		
		assertThat(z6.getMin() == 1).isTrue();
	}

	@Test
	public void testGetMax() {
		Zad6 z6 = new Zad6();
		
		assertThat(z6.getMax() == 42).isTrue();
	}
	
}

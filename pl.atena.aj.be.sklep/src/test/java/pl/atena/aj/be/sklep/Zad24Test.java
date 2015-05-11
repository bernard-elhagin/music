package pl.atena.aj.be.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.Test;

public class Zad24Test {

	@Test
	public void testException() {
		try {
			String out = Main.readConsoleLine();
		} catch (IOException e) {
			assertThat(e).isNotNull();
		}
	}
}

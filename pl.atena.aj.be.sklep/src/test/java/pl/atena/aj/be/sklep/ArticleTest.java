package pl.atena.aj.be.sklep;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArticleTest {

	@Test
	public void test1() {
		Article art = new Article();
		
		art.setID(4);
		art.setDescription("opis");
		art.setName("test");
		art.setPrice(15.99);

		assertThat(art.getID()).isEqualTo(4);
	}
	
	@Test
	public void test2() {
		Article art = new Article();

		art.setDescription("test");
		
		assertThat(art.getDescription()).isEqualTo("test");
	}
	
	@Test
	public void test3() {
		Article art = new Article();

		art.setDescription("test");
		
		assertThat(art.getPrice()).isEqualTo(0.0);
	}
}

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
	
	@Test
	public void testCounter1() {
		Article.resetCounter(); // Konieczne by siê uniezale¿niæ od poprzednich testów,
								// po których Article.counter == 3.
		
		Article art1 = new Article();
		Article art2 = new Article();
		Article art3 = new Article(4, "d", 9.0, "d");

		assertThat(art3.getCounter()).isEqualTo(3);
	}
	
	@Test
	public void testGettersAndSetters1() {
		Article art = new Article(4, null, 9.0, "d");
		
		art.setName("test");
		
		assertThat(art.getName()).isEqualTo("test");
	}
	
	@Test
	public void testGettersAndSetters2() {
		Article art = new Article(4, "test", 9.0, "d");
		
		assertThat(art.getPrice()).isEqualTo(9.0);
	}

}

package pl.atena.aj.be.sklep;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

	@Test
	public void testAuthorization() {
		Employee emp = new Employee();
		
		assertThat(emp.getAuthorization()).isFalse();
	}
	
	@Test
	public void testCounter() {
		Employee emp = new Employee();
		
		assertThat(emp.getId()).isEqualTo(1);
	}
}

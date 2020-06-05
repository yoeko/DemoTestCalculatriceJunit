package demoTestCalculatriceJunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import service.Calculatrice;

public class DemoTestCalculatrice {
	
	private Calculatrice maCalculatrice;
	
	@BeforeEach
	public void test() {
		maCalculatrice = new Calculatrice();
	}
	
	@Test
	public void testResultatAdditionDeuxNombre() {
		assertEquals(maCalculatrice.addition(3, 4), 7);
//		fail("failed");
	}
	
	@Test
	public void testResultatDivision() {
		assertEquals(maCalculatrice.division(4, 2), 2);
	}
	
	@Disabled()
	@Test
	public void testResultatDivision2() {
		assertEquals(maCalculatrice.division(4, 2), 2);
	}
	
	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
		 Exception exception = assertThrows(ArithmeticException.class, () -> maCalculatrice.division(4, 0) );
	}
	
	@AfterEach
	public void tearDown() {
		maCalculatrice = null;
	}

}

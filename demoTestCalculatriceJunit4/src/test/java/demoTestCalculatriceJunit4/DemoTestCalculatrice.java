package demoTestCalculatriceJunit4;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import service.Calculatrice;

public class DemoTestCalculatrice {
	
private Calculatrice maCalculatrice;
	
	@Before
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
		float result = maCalculatrice.division(4, 2);
		assertEquals(2, result, 2);
	}
	
	@Test(expected = ArithmeticException.class)
	public void whenExceptionThrown_thenAssertionSucceeds() {
		maCalculatrice.division(4, 0);
	}
	
	@Ignore()
	public void whenExceptionThrown_thenAssertionSucceeds2() {
		maCalculatrice.division(4, 0);
	}

	@After
	public void tearDown() {
		maCalculatrice = null;
	}


}

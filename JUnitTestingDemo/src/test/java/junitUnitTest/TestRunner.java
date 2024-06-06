package junitUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestRunner {
	
// in this we can run code without main method,there is no object created here and also methods are not static.
	
	protected int value1 , value2 ;
	
	@Before
	public void setup() {
		value1 = 3;
		value2 = 3;
	}
	
	@Test
	public void testAdd() {
		double result = value1 + value2 ;
		assertTrue(result == 6);
	}
	
	@Test
	public void testSentenceComparison() {
		
		String s1 = "JUnit is working fine";
		String s2 ="JUnit is working fine";  // you can call one api here and verify that its return type is string or not
		
		assertEquals(s1, s2);
		
		//assertion = confimation
	}
	
	@Test
	public void addTest() {
		
		double result = 1+5;
		assertTrue(result == 6);
		
	}
	
 /*	@Test
	public void testNull() {
		
		Object temp = null ;
		assertNotNull(temp);
		
	}*/
	

}

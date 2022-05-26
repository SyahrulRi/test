import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
//		fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public final void testAddBoundary() {
//	Cannot be below 0 OR above 9999
		int a = 100000;
		int b = 0;
		
		
		if (a >= 10000) {
			int lengthA = Integer.toString(a).length();
			assertFalse("Is the numbers within the boundary?",(lengthA <= 4 && lengthA > 0));
		} else if (a < 0) {
			assertFalse("Is the numbers within the boundary?",(a > 0));
		} else if (b >= 10000) {
			int lengthB = Integer.toString(b).length();
			assertFalse("Is the numbers within the boundary?",(lengthB <= 4 && lengthB > 0));
		} else if (b < 0) {
			assertFalse("Is the numbers within the boundary?",(b > 0));
		}
		
	}
	
	@Test
	public final void testAddError() {
//	No String or Null or wrong result
		int a = 12;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 20;
		assertNotEquals(expected,actual);
//		------------------------------------------------------
		String c = null;
		
		assertNull(c);
//		------------------------------------------------------
		String d = "2";
		int e = 4;
		
		String actual2 = d + e;
		
		int expected2 = 6;
		assertNotEquals(expected2,actual2);

	}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testSubstractBoundary() {
//		Cannot be below 0 OR above 9999
			int a = 0;
			int b = 0;
			
			if (a >= 10000) {
				int lengthA = Integer.toString(a).length();
				assertFalse("Is the numbers within the boundary?",(lengthA <= 4 && lengthA > 0));
			} else if (a < 0) {
				assertFalse("Is the numbers within the boundary?",(a > 0));
			} else if (b >= 10000) {
				int lengthB = Integer.toString(b).length();
				assertFalse("Is the numbers within the boundary?",(lengthB <= 4 && lengthB > 0));
			} else if (b < 0) {
				assertFalse("Is the numbers within the boundary?",(b > 0));
			}
			
		}
	
	@Test
	public final void testSubstractError() {
//	No String or Null or wrong result
		int a = 12;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 20;
		assertNotEquals(expected,actual);
//		------------------------------------------------------
		String c = null;
		
		assertNull(c);
//		------------------------------------------------------
	}
	
	@Test
	public final void testMultiple() {
		int a = 1000;
		int b = 9;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 9000;
		assertEquals(actual , expected);
	}
	
	@Test
	public final void testMultipleBoundary() {
//		Cannot be below 0 OR above 9999
			int a = 0;
			int b = 0;
			
			if (a >= 10000) {
				int lengthA = Integer.toString(a).length();
				assertFalse("Is the numbers within the boundary?",(lengthA <= 4 && lengthA > 0));
			} else if (a < 0) {
				assertFalse("Is the numbers within the boundary?",(a > 0));
			} else if (b >= 10000) {
				int lengthB = Integer.toString(b).length();
				assertFalse("Is the numbers within the boundary?",(lengthB <= 4 && lengthB > 0));
			} else if (b < 0) {
				assertFalse("Is the numbers within the boundary?",(b > 0));
			}
			
		}
	
	@Test
	public final void testMultipleError() {
//	No String or Null or wrong result
		int a = 12;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 20;
		assertNotEquals(expected,actual);
//		------------------------------------------------------
		String c = null;
		
		assertNull(c);
//		------------------------------------------------------
	}
	
	@Test
	public final void testDivide() {
		int a = 5555;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1111;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testDivideBoundary() {
//		Cannot be below 1 OR above 9999
			int a = 0;
			int b = 0;
			
			if (a >= 10000) {
				int lengthA = Integer.toString(a).length();
				assertFalse("Is the numbers within the boundary?",(lengthA <= 4 && lengthA > 0));
			} else if (a <= 0) {
				assertFalse("Is the numbers within the boundary?",(a >= 1));
			} else if (b >= 10000) {
				int lengthB = Integer.toString(b).length();
				assertFalse("Is the numbers within the boundary?",(lengthB <= 4 && lengthB > 0));
			} else if (b <= 0) {
				assertFalse("Is the numbers within the boundary?",(b >= 1));
			}
	}
			@Test
			public final void testDivideError() {
//			No String or Null or wrong result
				int a = 12;
				int b = 4;
				
				Calculator cal = new Calculator();
				int actual = cal.add(a, b);
				
				int expected = 20;
				assertNotEquals(expected,actual);
//				------------------------------------------------------
				String c = null;
				
				assertNull(c);
//				------------------------------------------------------

			}
		}
	

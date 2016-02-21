package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

import cse360assign2.OrderedIntList;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotEquals(null, calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.add(11);
		assertEquals(11, calc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		calc.add(5);
		assertEquals(5, calc.getTotal());
		calc.add(6);
		assertEquals(11, calc.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
		calc.subtract(-26);
		assertEquals(21, calc.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(1);
		calc.multiply(10);
		assertEquals(10, calc.getTotal());
		calc.multiply(35);
		assertEquals(350, calc.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(100);
		calc.divide(2);
		assertEquals(50, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}

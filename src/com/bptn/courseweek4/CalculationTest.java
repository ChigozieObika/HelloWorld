package com.bptn.courseweek4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void testFindMax() {
		assertEquals(4, Calculation.findMax(new int [] {1, 3, 4, 2}));
		assertEquals(-1, Calculation.findMax(new int [] {-12, -1, -3, -4, -2}));
	}
	
	@Test
	public void testFindMax2() {
		assertEquals(4, Calculation.findMax(new int [] {1, 3, 4, 2}));
		assertEquals(-10, Calculation.findMax(new int [] {-12, -1, -3, -4, -2}));
	}
	
	@Test
	public void testFindMax3() {
		assertEquals(4, Calculation.findMax(new int [] {1, 3, 4, 2}));
		assertEquals(-1, Calculation.findMax(new int [] {-12, -1, -3, -4, -2}));
	}

}

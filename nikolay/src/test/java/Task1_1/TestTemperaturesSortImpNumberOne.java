package Task1_1;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class TestTemperaturesSortImpNumberOne {
	
	private TemperaturesSortToZero ts;
	
	@Before
	public void init() {
		ts = new TemperaturesSortImpNumberOne();
	}
	
	@Test
	public void test() {
		double values[] = {};
		assertTrue(ts.closestToZero(values) == 0);
	}
	// -1 1
	@Test
	public void test2() {
		double values[] = { 2.1, 43.56, 879, 9, 4, 213, 54, 66.7, 8, 9.20, -1, 3.4, 23, 7, 892, 123, 32, 1, 23.4, 678,
				2, 3, 45, 78, 9 };
		assertTrue(ts.closestToZero(values) == closestToZeroVersionToTest(values));
	}
	// 1
	@Test
	public void test3() {
		double values[] = { 2.1, 43.56, 879, 9, 4, 213, 54, 66.7, 8, 9.20, -2, 3.4, 23, 7, 892, 123, 32, 1, 23.4, 678,
				2, 3, 45, 78, 9 };
		assertTrue(ts.closestToZero(values) == closestToZeroVersionToTest(values));
	}
	// -1
	@Test
	public void test4() {
		double values[] = { 2.1, 43.56, 879, 9, 4, 213, 54, 66.7, 8, 9.20, -1, 3.4, 23, 7, 892, 123, 32, 2, 23.4, 678,
				2, 3, 45, 78, 9 };
		assertTrue(ts.closestToZero(values) == closestToZeroVersionToTest(values));
	}
	@Test
	public void test5() {
		double values[] = {2.1};
		assertTrue(ts.closestToZero(values) == closestToZeroVersionToTest(values));
	}
	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		double values[] ={5526};
		ts.closestToZero(values);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test7() {
		double values[] = {-273};
		ts.closestToZero(values);
	}
	private double closestToZeroVersionToTest(double values[]){
		
		double pNumber = 5526;
		double navNumber = -273;
		for (double c : values) {
			if (c >= 0) {
				if (c < pNumber) {
					pNumber = c;
				}
			} else {
				if (c > navNumber) {
					navNumber = c;
				}
			}
		}
		double result;
		if (pNumber == Math.abs(navNumber)) {
			result = pNumber;
		} else {
			result = Math.min(Math.abs(navNumber), pNumber);
			if (result == Math.abs(navNumber)) {
				result = navNumber;
			}
		}
		return result;
	}

}

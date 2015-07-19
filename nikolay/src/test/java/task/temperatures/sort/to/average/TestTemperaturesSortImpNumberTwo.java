package task.temperatures.sort.to.average;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import task.temperatures.sort.to.average.TemperaturesSortImpNumberTwo;
import task.temperatures.sort.to.average.TemperaturesSortToAverage;

public class TestTemperaturesSortImpNumberTwo {
	
	TemperaturesSortToAverage ts;

	@Before
	public void init() {
		ts = new TemperaturesSortImpNumberTwo();
	}

	@Test
	public void test() {
		double values[] = {};
		assertTrue(ts.closestToAverege(values) == 0);
	}

	@Test
	public void test2() {
		double values[] = { 2.1, 43.56, 879, 9, 4, 213, 54, 66.7, 8, 9.20, -1, 3.4, 23, 7, 892, 123, 32, 1, 23.4, 678,
				2, 3, 45, 78, 9 };
		assertTrue(ts.closestToAverege(values) == closestToAveregeVersionToTest(values));
	}

	@Test
	public void test3() {
		double values[] = { 2.1, 43.56, 879, 9, 4, 130, 54, 66.7, 8, 9.20, -1, 3.4, 23, 7, 892, 103, 32, 1, 23.4, 678,
				2, 3, 45, 78, 9 };
		assertTrue(ts.closestToAverege(values) == closestToAveregeVersionToTest(values));
	}

	@Test
	public void test4() {
		double values[] = { 2.1 };
		assertTrue(ts.closestToAverege(values) == closestToAveregeVersionToTest(values));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test6() {
		double values[] = { -273 };
		ts.closestToAverege(values);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test7() {
		double values[] = { 5526 };
		ts.closestToAverege(values);
	}

	private double closestToAveregeVersionToTest(double values[]) {
		double average = 0;
		for (double a : values) {
			average += a;
		}
		average = average / values.length;
		double pNumber = 5526;
		double navNumber = -273;
		for (double c : values) {
			if (c >= average) {
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
		if (Math.abs(Math.abs(average) - Math.abs(pNumber)) > Math.abs(Math.abs(average) - Math.abs(navNumber))) {
			result = navNumber;
		} else {
			result = pNumber;
		}
		return result;
	}
}

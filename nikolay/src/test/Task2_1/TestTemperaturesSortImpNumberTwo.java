package Task2_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class TestTemperaturesSortImpNumberTwo {
	TemperaturesSortToAverage ts = new TemperaturesSortImpNumberTwo();
	Random random = new Random();

	@Test
	public void test() {
		double values[] = {};
		assertTrue(ts.closestToAverege(values) == 0);
	}

	@Test
	public void test2() {
		int number = random.nextInt(49) + 1;
		double values[] = new double[number];
		for (int index = 0; index < number; index++) {
			if (random.nextInt(2) == 0) {
				values[index] = random.nextInt(5526)
						/ Math.pow(10, random.nextInt(5));
			} else {
				values[index] = -1 * random.nextInt(273)
						/ Math.pow(10, random.nextInt(4));
			}
		}
		double average = 0;
		for (double a : values) {
			average += a;
		}
		average = average/number;
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
		if (Math.abs(Math.abs(average) - Math.abs(pNumber)) > Math.abs(Math
				.abs(average) - Math.abs(navNumber))) {
			result = navNumber;
		} else {
			result = pNumber;
		}
		assertTrue(ts.closestToAverege(values) == result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test3() {
		double values[] = new double[1];
		if (random.nextInt(2) == 0) {
			values[0] = random.nextInt(5526) / Math.pow(10, random.nextInt(5))
					+ 5526;
		} else {
			values[0] = -1 * random.nextInt(273)
					/ Math.pow(10, random.nextInt(4)) - 273;
		}
		ts.closestToAverege(values);
	}
}

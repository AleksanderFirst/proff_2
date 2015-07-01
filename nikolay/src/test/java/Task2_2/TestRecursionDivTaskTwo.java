package Task2_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestRecursionDivTaskTwo {

	RecursionDiv recursion;

	@Before
	public void init() {
		recursion = new RecursionDivTaskTwo();
	}

	@Test
	public void test() {
		List<Double> list = new ArrayList<>();
		double values[] = { 2, 4, 54, 6, 7, 8, 9, 2, 45, 120 };
		for (double c : values) {
			list.add(c);
		}
		Double sum = (double) 0;
		for (int index = 0; index < list.size(); index++) {
			sum += list.get(index);
		}
		assertEquals(sum, recursion.sumListRecursionDiv(list), 0);
	}

	@Test()
	public void test2() {
		List<Double> list = new ArrayList<>();
		assertEquals(0, recursion.sumListRecursionDiv(list), 0);
	}

}

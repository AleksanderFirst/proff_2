package Task2_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestRecursionDivTaskTwo {

	@Test
	public void test() {
		List<Double> list = new ArrayList<>();
		Random random = new Random();
		for(int index = random.nextInt(50);index >=0;index--){
			list.add((double)random.nextInt());
		}
		RecursionDiv recursion = new RecursionDivTaskTwo();
		Double sum = (double) 0;
		for(int index = 0;index < list.size();index++){
			sum += list.get(index);
		}
		assertEquals(sum,recursion.sumListRecursionDiv(list), 0);
	}

}


package Task1_1;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestTemperaturesSortImpNumberOne {
	TemperaturesSortToZero ts = new TemperaturesSortImpNumberOne();
	Random random = new Random();

	@Test
	public void test() {
		double values[] = {};
		assertTrue(ts.closestToZero(values) == 0);
	}

	@Test
	public void test2() {
		int number  = random.nextInt(49)+1;
		double values[] = new double[number];
		for(int index = 0;index < number;index++){
			if(random.nextInt(2) == 0){
				values[index] = random.nextInt(5526)/Math.pow(10, random.nextInt(5));
			}else{
			values[index] = -1*random.nextInt(273)/Math.pow(10, random.nextInt(4)) ;
			}
		}
		double pNumber = 5526;
		double navNumber = -273;
		for(double c: values){
			if(c>=0){
				if(c<pNumber){
				pNumber = c;}
			}else{
				if(c>navNumber){
					navNumber = c;
				}
			}
		}
		double result;
		if(pNumber == Math.abs(navNumber)){
			result = pNumber;
		}else{
			result = Math.min(Math.abs(navNumber), pNumber);
			if (result == Math.abs(navNumber)) {
				result = navNumber;
		}
		assertTrue(ts.closestToZero(values) == result);
		}
	}
	@Test(expected = IllegalArgumentException.class)
	public void test3() {
		double values[] = new double[1];
		if(random.nextInt(2) == 0){
			values[0] = random.nextInt(5526)/Math.pow(10, random.nextInt(5)) + 5526;
		}else{
			values[0] = -1*random.nextInt(273)/Math.pow(10, random.nextInt(4)) - 273;
		}
		ts.closestToZero(values);
	}

}

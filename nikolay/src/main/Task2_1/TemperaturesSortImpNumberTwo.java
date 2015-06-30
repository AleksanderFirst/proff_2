package Task2_1;

import java.util.Arrays;

public class TemperaturesSortImpNumberTwo implements TemperaturesSortToAverage {
	public double closestToAverege(double[] ts) {
		if (ts.length < 2) {
			if(ts.length == 1){
				return ts[0];
			}
			return 0;
		}
		double average = 0;
		for (double c : ts) {
			average += c;
		}
		Arrays.sort(ts);
		int goalIndex = 0;
		boolean findGoalIndex = true;
		for (int index = 0; index < ts.length; index++) {
			if (ts[index] > (-273) && ts[index] < 5526) {
				if (findGoalIndex && ts[index] > average / ts.length) {
					goalIndex = index;
					findGoalIndex = false;
				}
			} else {
				throw new IllegalArgumentException(
						"Ne :" + ts[index]);
			}
		}
		if (Math.abs((Math.abs(average / ts.length) - Math.abs(ts[goalIndex]))) < Math
				.abs((Math.abs(average / ts.length) - Math
						.abs(ts[goalIndex - 1])))) {
			return ts[goalIndex];
		} else {
			return ts[goalIndex - 1];
		}
	}

}

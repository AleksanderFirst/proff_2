package Task2_1;

import java.util.Arrays;

public class TemperaturesSortImpNumberTwo implements TemperaturesSortToAverage {
	
	public double closestToAverege(double[] ts) {
		if (ts.length < 2) {
			if (ts.length == 1) {
				tsMeater(ts[0]);
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
			if (tsMeater(ts[index])) {
				if (findGoalIndex && ts[index] > average / ts.length) {
					goalIndex = index;
					findGoalIndex = false;
				}
			}
		}
		if (Math.abs((Math.abs(average / ts.length) - Math.abs(ts[goalIndex]))) < Math
				.abs((Math.abs(average / ts.length) - Math.abs(ts[goalIndex - 1])))) {
			return ts[goalIndex];
		} else {
			return ts[goalIndex - 1];
		}
	}

	private boolean tsMeater(double ts) {
		if (ts > (-273) && ts < 5526) {
			return true;
		}
		throw new IllegalArgumentException("Неверный показатель температуры:" + ts);
	}
}

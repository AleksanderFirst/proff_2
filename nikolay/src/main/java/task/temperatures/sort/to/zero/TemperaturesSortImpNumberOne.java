package task.temperatures.sort.to.zero;

import java.util.Arrays;

public class TemperaturesSortImpNumberOne implements TemperaturesSortToZero {
	
	public double closestToZero(double[] ts) {
		if (ts.length < 2) {
			if (ts.length == 1) {
				tsMeater(ts[0]);
				return ts[0];
			}
			return 0;
		}
		Arrays.sort(ts);
		int goalIndex = 0;
		boolean findGoalIndex = true;
		double result;
		for (int index = 0; index < ts.length; index++) {
			if (tsMeater(ts[index])) {
				if (findGoalIndex && ts[index] > 0) {
					goalIndex = index;
					findGoalIndex = false;
				}
			}
		}
		if (Math.abs(ts[goalIndex - 1]) == ts[goalIndex]) {
			result = ts[goalIndex];
		} else {
			result = Math.min(Math.abs(ts[goalIndex - 1]), ts[goalIndex]);
			if (result == Math.abs(ts[goalIndex - 1])) {
				result = ts[goalIndex - 1];
			}
		}
		return result;
	}

	private boolean tsMeater(double ts) {
		if (ts > (-273) && ts < 5526) {
			return true;
		}
		throw new IllegalArgumentException(String.valueOf(ts));
	}
}

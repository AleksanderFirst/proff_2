package Task1_1;

import java.util.Arrays;

public class TemperaturesSortImpNumberOne implements TemperaturesSortToZero {
	public double closestToZero(double[] ts) {
		if (ts.length < 2) {
			if(ts.length == 1){
				return ts[0];
			}
			return 0;
		}
		Arrays.sort(ts);
		int goalIndex = 0;
		boolean findGoalIndex = true;
		double result;
		for (int index = 0; index < ts.length; index++) {
			if (ts[index] > (-273) && ts[index] < 5526) {
				if (findGoalIndex && ts[index] > 0) {
					goalIndex = index;
					findGoalIndex = false;
				}
			} else {
				throw new IllegalArgumentException(
						"Неверный показатель температуры:" + ts[index]);
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

}

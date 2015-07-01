package Task2_2;

import java.util.List;

public class RecursionDivTaskTwo implements RecursionDiv {

	public double sumListRecursionDiv(List<Double> list) {
		if (list.size() == 0) {
			return  0;
		}
		if (list.size() % 2 == 0) {
			if (list.size() / 2 != 1) {
				return sumListRecursionDiv(list.subList(0, list.size() / 2))
						+ sumListRecursionDiv(list.subList(list.size() / 2,
								list.size()));
			} else {
				list.set(0, list.get(0) + list.get(1));
				return list.get(0);
			}
		} else {
			return sumListRecursionDiv(list.subList(0, list.size() - 1))
					+ list.get(list.size() - 1);
		}
	}

}

package EmployeeRecursion;

import java.util.List;


public class SumSalaryEmployerRecursion implements SalaryEmployerRecursion {
	public double sumBitchEmployee(List<Employee> list) throws IndexOutOfBoundsException{
		return sumEmployee(list, 0);
	}

	private double sumEmployee(List<Employee> list, int index) {
		if (index < list.size() - 1) {
			return list.get(index).getSalary() + sumEmployee(list, index + 1);
		} else {
			return list.get(index).getSalary();
		}

	}

}

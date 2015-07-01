package Employee;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import EmployeeRecursion.Employee;
import EmployeeRecursion.SalaryEmployerRecursion;
import EmployeeRecursion.SumSalaryEmployerRecursion;

public class TestEmployeeRecursion {

	@Test
	public void test() {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee("Mydak0", "123", 30));
		employee.add(new Employee("Mydak1", "123", 35));
		employee.add(new Employee("Mydak2", "123", 123));
		employee.add(new Employee("Mydak3", "123", 435));
		employee.add(new Employee("Mydak4", "123", 36));
		employee.add(new Employee("Mydak5", "123", 93485));
		double sum = 0;
		for (int index = 0; index < employee.size(); index++) {
			sum += employee.get(index).getSalary();
		}
		SalaryEmployerRecursion employeer = new SumSalaryEmployerRecursion();
		assertEquals(sum, employeer.sumBitchEmployee(employee), 0);
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void test2() {
		List<Employee> employee2 = new ArrayList<>();
		SalaryEmployerRecursion employeer2 = new SumSalaryEmployerRecursion();
		employeer2.sumBitchEmployee(employee2);
	}
}



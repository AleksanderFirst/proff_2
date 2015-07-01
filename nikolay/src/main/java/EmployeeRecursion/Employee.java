package EmployeeRecursion;

public class Employee {
	public Employee(String name, String secondName, double salary) {
		setName(name);
		setSecondName(secondName);
		setSalary(salary);
	}

	private String Name;
	private String SecondName;
	private double Salary;

	public String getName() {
		return Name;
	}

	private void setName(String name) {
		Name = name;
	}

	public String getSecondName() {
		return SecondName;
	}

	private void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public double getSalary() {
		return Salary;
	}
	private void setSalary(double salary) {
		Salary = salary;
	}
}
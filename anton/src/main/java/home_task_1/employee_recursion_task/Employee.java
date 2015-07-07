package home_task_1.employee_recursion_task;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Антон on 24.06.2015.
 */
public class Employee implements Comparable{
    private String firstName;
    private String secondName;
    private BigDecimal salary;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee(String firstName, String secondName, BigDecimal salary){
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (secondName != null ? !secondName.equals(employee.secondName) : employee.secondName != null) return false;
        return !(salary != null ? !salary.equals(employee.salary) : employee.salary != null);

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        return result;
    }

    public static ArrayList<Employee> getEmployees(){
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Anton", "Babak", new BigDecimal(1000)));
        list.add(new Employee("Roman", "Ivanchenko", new BigDecimal(2200)));

        return list;
    }

    public int compareTo(Object o) {
        Employee employee = (Employee)o;
        if (salary.compareTo(employee.getSalary()) > 0) return 1;
        if (salary.compareTo(employee.getSalary()) < 0) return -1;
        return 0;

    }
}

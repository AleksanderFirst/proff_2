package examples.recursion;

import examples.entities.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 6/23/2015.
 */
public class EmployeeRecursion {

    public List<Employee> getEmployees() {
        Employee e = new Employee();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        return employeeList;
    }

    public Double getSalary(List<Employee> employees) {
        return 0.0;
    }
}

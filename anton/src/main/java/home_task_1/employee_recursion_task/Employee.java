package home_task_1.employee_recursion_task;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Антон on 24.06.2015.
 */
public class Employee {
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

    public static ArrayList<Employee> getEmployees(){
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Anton", "Babak", new BigDecimal(1000)));
        list.add(new Employee("Roman", "Ivanchenko", new BigDecimal(2200)));
        return list;
    }
}

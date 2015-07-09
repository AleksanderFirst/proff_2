package examples.entities;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by user on 6/23/2015.
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private String secondName;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int compareTo(Employee o) {
        if(this.getSalary() > o.getSalary()) return 1;
        if(this.getSalary() < o.getSalary()) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getName(), employee.name)
                && Objects.equals(getSecondName(), employee.secondName)
                && Objects.equals(getSalary(), employee.salary);

    }

    @Override
    public int hashCode() {
        return 1;
    }
}

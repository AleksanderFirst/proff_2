package archive;

import employeeRecursion.EmplRecursion;
import employeeRecursion.EmployeeK;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestEmployeeRecursion {

    private EmplRecursion employeeRecursion = new EmplRecursion();

    @Test
    public void testRecursion() {
        List<EmployeeK> employees = EmplRecursion.getEmployeeK();
        Double recursionSalary = employeeRecursion.getSalaryK(employees, 1);
        Double nonRecursion = getSalary(employees);
        Assert.assertEquals(recursionSalary, nonRecursion);
        System.out.println(nonRecursion + " -NR");
        System.out.printf(recursionSalary+ " -R!");
    }

    public Double getSalary(List<EmployeeK> employeeList) {
        Double result = 0.0;
        for (EmployeeK e : employeeList) {
            result += e.getSalary();
        }
        return result;
    }
    }
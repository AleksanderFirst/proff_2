import examples.entities.Employee;
import examples.recursion.EmployeeRecursion;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by user on 6/23/2015.
 */
public class RecursionTests {
    private EmployeeRecursion employeeRecursion = new EmployeeRecursion();

    @Test
    public void testTwoBigDecimal() {
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(20);
        Assert.assertEquals(b1, b2);
    }

    @Test
    public void testRecursion() {
        List<Employee> employees = employeeRecursion.getEmployees();
        Double recursionSalary = employeeRecursion.getSalary(employees);
        Double nonRecursion = getSalary(employees);
        Assert.assertEquals(recursionSalary, nonRecursion);
    }

    public Double getSalary(List<Employee> employeeList) {
        Double result = 0.0;
        for(Employee e : employeeList) {
            result += e.getSalary();
        }
        return result;

    }

}

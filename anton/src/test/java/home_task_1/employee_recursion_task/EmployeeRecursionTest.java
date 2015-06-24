package home_task_1.employee_recursion_task;

import home_task_1.employee_recursion_task.Employee;
import home_task_1.employee_recursion_task.EmployeeRecursion;
import org.junit.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Антон on 24.06.2015.
 */
public class EmployeeRecursionTest {
    private EmployeeRecursion employeeRecursion = new EmployeeRecursion();

    @Test
    public void testEmployeeRecursion(){
        ArrayList<Employee> list = Employee.getEmployees();
        employeeRecursion.SummarizeSalary(list);
        BigDecimal recursionSalary = employeeRecursion.getSum();
        BigDecimal cycleSalary = CycleSummarize(list);
        Assert.assertEquals(recursionSalary,cycleSalary);
    }

    public static BigDecimal CycleSummarize(ArrayList<Employee> employees){
        BigDecimal sum = BigDecimal.ZERO;
        for (Employee employee: employees){
            sum = sum.add(employee.getSalary());
        }
        return sum;
    }
}

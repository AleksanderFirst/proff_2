package home_task_1.employee_recursion_task;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Антон on 24.06.2015.
 */
public class EmployeeRecursion {
    private int i = 0;
    private BigDecimal sum = BigDecimal.ZERO;

    public BigDecimal getSum() {
        return sum;
    }

    public void SummarizeSalary (ArrayList<Employee> employees){
        while(i < employees.size()){

            sum = sum.add(employees.get(i).getSalary());
            i++;
            SummarizeSalary(employees);
        }
    }
}

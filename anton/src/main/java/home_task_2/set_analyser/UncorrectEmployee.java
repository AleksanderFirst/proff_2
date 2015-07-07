package home_task_2.set_analyser;

import home_task_1.employee_recursion_task.Employee;

import java.math.BigDecimal;

/**
 * Created by Антон on 07.07.2015.
 */
public class UncorrectEmployee extends Employee {
    public UncorrectEmployee(String firstName, String secondName, BigDecimal salary) {
        super(firstName, secondName, salary);
    }

    @Override
    public int hashCode(){
        return 1;
    }
}

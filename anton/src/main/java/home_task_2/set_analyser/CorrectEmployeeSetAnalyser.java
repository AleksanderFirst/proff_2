package home_task_2.set_analyser;

import home_task_1.employee_recursion_task.Employee;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by Антон on 07.07.2015.
 */
public class CorrectEmployeeSetAnalyser implements ISetAnalyser {

    private Set<Employee> set;
    public CorrectEmployeeSetAnalyser (Set<Employee> set){
        this.set = set;
    }

    public long getAddTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            set.add(new Employee("Anton","Babak",new BigDecimal(i)));
        }
        return System.currentTimeMillis() - time;
    }

    public long getRemoveTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Employee unemp = new Employee("Anton","Babak",new BigDecimal(i));
            set.remove(unemp);
        }
        return System.currentTimeMillis() - time;
    }
}

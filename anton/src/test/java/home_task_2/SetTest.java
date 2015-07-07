package home_task_2;

import home_task_1.employee_recursion_task.Employee;
import home_task_2.set_analyser.CorrectEmployeeSetAnalyser;
import home_task_2.set_analyser.UncorrectEmployee;
import home_task_2.set_analyser.UncorrectEmployeeSetAnalyser;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Антон on 07.07.2015.
 */
public class SetTest {

    private CorrectEmployeeSetAnalyser correctEmployeeSetAnalyser;
    private UncorrectEmployeeSetAnalyser uncorrectEmployeeSetAnalyser;

    @Test
    public void setTest(){
        Set<Employee> goodEmployees = new HashSet<Employee>();
        Set<UncorrectEmployee> badEmployees = new HashSet<UncorrectEmployee>();
        goodEmployees.add(new Employee("Anton", "Babak", new BigDecimal(150.00)));
        goodEmployees.add(new Employee("Anton", "Babak", new BigDecimal(150.00)));
        goodEmployees.add(new Employee("Valeriy", "Teslenko", new BigDecimal(120.00)));
        badEmployees.add(new UncorrectEmployee("Anton", "Babak", new BigDecimal(150.00)));
        badEmployees.add(new UncorrectEmployee("Anton", "Babak", new BigDecimal(150.00)));
        badEmployees.add(new UncorrectEmployee("Valeriy", "Teslenko", new BigDecimal(120.00)));
        Assert.assertEquals(goodEmployees.size(),badEmployees.size());
    }
    @Test
    public void employeeSetTest(){
        Set<Employee> goodEmployees = new HashSet<Employee>();
        Set<UncorrectEmployee> badEmployees = new HashSet<UncorrectEmployee>();
        correctEmployeeSetAnalyser = new CorrectEmployeeSetAnalyser(goodEmployees);
        uncorrectEmployeeSetAnalyser = new UncorrectEmployeeSetAnalyser(badEmployees);
        System.out.println(correctEmployeeSetAnalyser.getAddTime());
        System.out.println(uncorrectEmployeeSetAnalyser.getAddTime());
        System.out.println(goodEmployees.size());
        System.out.println(badEmployees.size());
        System.out.println(correctEmployeeSetAnalyser.getRemoveTime());
        System.out.println(uncorrectEmployeeSetAnalyser.getRemoveTime());
    }
}

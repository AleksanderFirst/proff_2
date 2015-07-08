package home_task_2;

import com.carrotsearch.sizeof.RamUsageEstimator;
import home_task_1.employee_recursion_task.Employee;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Антон on 08.07.2015.
 */
public class MemoryListTest {

    private Employee employee;
    private List<Employee> employeeArrayList;
    private List<Employee> employeeLinkedList;
    private Employee [] employees;


    @Before
    public void init(){
        employee = new Employee("Anton","Babak",new BigDecimal(100));
        employeeArrayList = new ArrayList<Employee>();
        employeeLinkedList = new LinkedList<Employee>();
        employees = new Employee[1000000];
        for (int i = 0; i < 1000000; i++) {
            employeeArrayList.add(employee);
            employeeLinkedList.add(employee);
            employees[i] = employee;
        }
    }

    @Test
    public void memoryListTest(){
        System.out.println("Size of ArrayList of 1 million employees " + RamUsageEstimator.sizeOf(employeeArrayList) + " kb");
        System.out.println("Size of LinkedList of 1 million employees " + RamUsageEstimator.sizeOf(employeeLinkedList) + " kb");
        System.out.println("Size of array of 1 million employees " + RamUsageEstimator.sizeOf(employees) + " kb");
    }

}

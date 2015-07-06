package home_task_2;


import com.carrotsearch.sizeof.RamUsageEstimator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectSizeTester {
    Employee employee;
    List<Employee> wLinkedList;
    List<Employee> wArrayList;
    Employee[] array;

    @Before
    public void init() {
        employee = new Employee("Worker");
        wLinkedList = new LinkedList<Employee>();
        wArrayList = new ArrayList<Employee>();
        array = new Employee[1000000];

        for (int i = 0; i < 1000000; i++) {
            wArrayList.add(employee);
            wLinkedList.add(employee);
            array[i] = employee;
        }
    }

    @Test
    public void printSize() {
        System.out.println("Size of 1 instanse of Employee class = " + RamUsageEstimator.sizeOf(employee) + " bytes");
        System.out.println("Size of array with 1 million employees = " + RamUsageEstimator.sizeOf(array) / 1024 + " kb");
        System.out.println("Size of ArrayList with 1 million employees = " + RamUsageEstimator.sizeOf(wArrayList) / 1024 + " kb");
        System.out.println("Size of LinkedList with 1 million employees = " + RamUsageEstimator.sizeOf(wLinkedList) / 1024 + " kb");

    }
}

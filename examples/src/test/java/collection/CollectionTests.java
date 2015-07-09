package collection;

import examples.entities.Employee;
import examples.mylist.MyArrayList;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by randriyanov on 30.06.15.
 */
public class CollectionTests {

    @Test
    public void testArrayList() {
        List<String> strings = new ArrayList<String>();
        strings.add("collection.Company");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");
        Iterator<String> iterator = strings.iterator();
        int flag = 1;
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(strings);
        LinkedList<String> strings1 = new LinkedList<String>();
        strings1.add("collection.Company");
        strings1.add("B");
        strings1.add("C");
        strings1.add("D");
        strings1.add("E");
        strings1.add("F");
        strings1.add("G");
        strings1.add("H");
        System.out.println(strings1);
        ListIterator<String> listIterator = strings1.listIterator(2);
        while (listIterator.hasNext()) {
                listIterator.next();
                listIterator.add("1");
                listIterator.next();
                listIterator.previous();
                listIterator.remove();
        }
        System.out.println(strings1);
     }

    @Test
    public void testQueu() throws Exception {
        Employee e = new Employee();
        e.setSalary(300.00);
        PriorityQueue<Employee> queuePrior = new PriorityQueue<Employee>();
        queuePrior.add(e);
        Employee e1 = new Employee();
        e1.setSalary(100.00);
        Employee e2 = new Employee();
        e2.setSalary(300.00);
        queuePrior.add(e1);
        queuePrior.add(e2);
        queuePrior.forEach(System.out::println);
        for (Employee emp : queuePrior) {
            System.out.println(emp.getSalary());
        }
    }

    @Test
    public void testDeqQueu() throws Exception {
        Employee e = new Employee();
        e.setSalary(300.00);
        LinkedList<Employee> linkedList = new LinkedList<>();
        ArrayDeque<Employee> deqQueu = new ArrayDeque<Employee>();
        deqQueu.add(e);
        Employee e1 = new Employee();
        e1.setSalary(100.00);
        Employee e2 = new Employee();
        e2.setSalary(300.00);
        deqQueu.add(e1);
        deqQueu.add(e2);
        deqQueu.forEach(System.out::println);
        for (Employee emp : deqQueu) {
            System.out.println(emp.getSalary());
        }
    }

    @Test
    public void testSet() throws Exception {
        Employee e = new Employee();
        e.setName("Gena");
        e.setSecondName("Gena");
        e.setSalary(100.00);
        Employee e1 = new Employee();
        e1.setName("Gena");
        e1.setSecondName("Ga");
        e1.setSalary(100.00);
        Employee e2 = new Employee();
        e2.setName("Ge");
        e2.setSecondName("Ga");
        e2.setSalary(300.00);
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(e);
        employeeSet.add(e1);
        employeeSet.add(e2);
        System.out.println(employeeSet.size());
        Iterator<Employee> iterator = employeeSet.iterator();
    }

    @Test
    public void testString() {
        String str = new String("test");
        String str1 = new String("test");
        System.out.println(str.intern() == str1.intern());
    }

    @Test
    public void testMap() {
        String a = "collection.Company";
        a = a.concat("B");
        System.out.println(a);
        Employee e = new Employee();
        e.setSalary(500.00);
        System.out.println(e.getSalary());
        e.setSalary(1000.00);
        System.out.println(e.getSalary());
        Set<Date> dates = new HashSet<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Date d3 = new Date();
        Date d4 = new Date();
        Date d5 = new Date();
        d1.setTime(1000);
        d2.setTime(10000000);
        d3.setTime(10);
        d4.setTime(100000);
        d5.setTime(10000);
        dates.add(d1);
        dates.add(d2);
        dates.add(d3);
        dates.add(d4);
        dates.add(d5);
        System.out.println(dates.contains(d1));
        if(dates.contains(d1)) {
            dates.remove(d1);
        }
        d1.setHours(100);
        dates.add(d1);
        System.out.println(dates.contains(d1));
        System.out.println(dates.size());

    }

    @Test
    public void testImmutableObj() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.get("A"));
        Collection<Set<Date>> strings = (Collection)map.values();
        System.out.println(strings.size());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }
}

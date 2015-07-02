import org.junit.Test;

import tasks.tester.ArrayListTester;
import tasks.tester.LinkedListTester;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by artem on 01.07.15.
 */
public class CollectionsTest {


    public ArrayList getArrayList(){
        ArrayList al= new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        return al;
    }
    public LinkedList getLinkedList(){
        LinkedList al= new LinkedList();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        return al;
    }

    @Test
    public void testArrTester(){
        ArrayList list = getArrayList();
        ArrayListTester tester = new ArrayListTester(list);
        System.out.println("ArrayList timings");
        System.out.println("Insert in the end"+"\t"+"\t"+tester.addInEndTiming(5));
        System.out.println("Insert in the middle"+"\t"+tester.addInMiddleTiming(5));
        System.out.println("Insert in the start"+"\t"+"\t"+tester.addInStartTiming(5));
    }
    @Test
    public void testLinkedTester(){
        LinkedList list = getLinkedList();
        LinkedListTester tester = new LinkedListTester(list);
        System.out.println("Linked list timings");
        System.out.println("Insert in the end"+"\t"+"\t"+tester.addInEndTiming(5));
        System.out.println("Insert in the middle"+"\t"+tester.addInMiddleTiming(5));
        System.out.println("Insert in the start"+"\t"+"\t"+tester.addInStartTiming(5));
    }



}

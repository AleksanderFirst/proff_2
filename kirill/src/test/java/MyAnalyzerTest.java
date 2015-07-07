import analZER.ArrayAnalyzerImpl;
import analZER.Result;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyAnalyzerTest {
    private ArrayList<String> testArrayList = new ArrayList<>();
    private LinkedList<String> testLinkedList = new LinkedList<>();
    private ArrayAnalyzerImpl test = new ArrayAnalyzerImpl();

    @Test
    public void TestResult() {
        Result.getAddTimeResult(testArrayList, testLinkedList);
        Result.getRemoveIndexTimeResult(testArrayList, testLinkedList);
        Result.getSetTimeResult(testArrayList, testLinkedList);
        Result.timeForGetResult(testArrayList, testLinkedList);
    }

    @Test
    public void getAddTime() {
        System.out.println(test.getAddTime(testArrayList));
        System.out.println(test.getAddTime(testLinkedList));

    }

    @Test
    public void getRemoveIndexTime() {
        test.getAddTime(testArrayList);
        test.getAddTime(testLinkedList);
        System.out.println(test.getRemoveIndexTime(testArrayList));
        System.out.println(test.getRemoveIndexTime(testLinkedList));
    }

    @Test
    public void timeForGet() {
        test.getAddTime(testArrayList);
        test.getAddTime(testLinkedList);
        System.out.println(test.timeForGet(testArrayList));
        System.out.println(test.timeForGet(testLinkedList));
    }

    @Test
    public void getSetTime() {
        System.out.println(test.getSetTime(testArrayList));
        System.out.println(test.getSetTime(testLinkedList));

    }
}

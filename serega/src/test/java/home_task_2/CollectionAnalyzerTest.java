package home_task_2;

import home_task_2.CollectionAnalyzer.AnalyzerFactory;
import home_task_2.CollectionAnalyzer.CollectionAnalyzer;
import org.junit.Test;


public class CollectionAnalyzerTest {

    @Test
    public void addTimeTest() throws ClassNotFoundException {
        System.out.println("#########");
        System.out.println("Add time:");
        CollectionAnalyzer arrayListAnalyzer = AnalyzerFactory.analyze("ArrayList");
        System.out.println("ArrayList: " + arrayListAnalyzer.getAddTime());
        System.out.println("ArrayList add to start: " + arrayListAnalyzer.getAddToStartTime());

        arrayListAnalyzer = AnalyzerFactory.analyze("LinkedList");
        System.out.println("LinkedList: " + arrayListAnalyzer.getAddTime());
        System.out.println("LinkedList add to start: " + arrayListAnalyzer.getAddToStartTime());
    }

    @Test
    public void setTimeTest() throws ClassNotFoundException {
        System.out.println("#########");
        System.out.println("Set time:");
        CollectionAnalyzer arrayListAnalyzer = AnalyzerFactory.analyze("ArrayList");
        System.out.println("ArrayList first: " + arrayListAnalyzer.getSetFirstElementTime());
        System.out.println("ArrayList last: " + arrayListAnalyzer.getSetLastElementTime());
        System.out.println("ArrayList middle: " + arrayListAnalyzer.getSetMiddleElementTime());

        arrayListAnalyzer = AnalyzerFactory.analyze("LinkedList");
        System.out.println("LinkedList first: " + arrayListAnalyzer.getSetFirstElementTime());
        System.out.println("LinkedList last: " + arrayListAnalyzer.getSetLastElementTime());
        System.out.println("LinkedList middle: " + arrayListAnalyzer.getSetMiddleElementTime());
    }

    @Test
    public void getTimeTest() throws ClassNotFoundException {
        System.out.println("#########");
        System.out.println("Get time:");
        CollectionAnalyzer arrayListAnalyzer = AnalyzerFactory.analyze("ArrayList");
        System.out.println("ArrayList first: " + arrayListAnalyzer.getTimeForGetFirstElement());
        System.out.println("ArrayList last: " + arrayListAnalyzer.getTimeForGetLastElement());
        System.out.println("ArrayList middle: " + arrayListAnalyzer.getTimeForGetMiddleElement());

        try {
            arrayListAnalyzer = AnalyzerFactory.analyze("LinkedList");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("LinkedList first: " + arrayListAnalyzer.getTimeForGetFirstElement());
        System.out.println("LinkedList last: " + arrayListAnalyzer.getTimeForGetLastElement());
        System.out.println("LinkedList middle: " + arrayListAnalyzer.getTimeForGetMiddleElement());
    }

    @Test
    public void getDeletionTimeTest() throws ClassNotFoundException {
        System.out.println("#########");
        System.out.println("Remove time:");
        CollectionAnalyzer arrayListAnalyzer = AnalyzerFactory.analyze("ArrayList");
        System.out.println("ArrayList: " + arrayListAnalyzer.getDeletionTime());

        arrayListAnalyzer = AnalyzerFactory.analyze("LinkedList");
        System.out.println("LinkedList: " + arrayListAnalyzer.getDeletionTime());
    }

    @Test
    public void getContainsTimeTest() throws ClassNotFoundException {
        System.out.println("#########");
        System.out.println("Contains time:");
        CollectionAnalyzer arrayListAnalyzer = AnalyzerFactory.analyze("ArrayList");
        System.out.println("ArrayList: " + arrayListAnalyzer.getSearchTime());

        arrayListAnalyzer = AnalyzerFactory.analyze("LinkedList");
        System.out.println("LinkedList: " + arrayListAnalyzer.getSearchTime());
    }


}

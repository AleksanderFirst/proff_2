package analZER;

import java.util.ArrayList;
import java.util.LinkedList;

public class Result {
    private static ArrayAnalyzerImpl test = new ArrayAnalyzerImpl();
    private static double a;
    private static double b;
    private static double k;

    public static void getAddTimeResult(ArrayList<String> x, LinkedList<String> y) {
        System.out.println("AddTime:");
        a = (double) test.getAddTime(x);
        b = (double) test.getAddTime(y);
        k = Math.abs(((a / b) - 1) * 100);
        if (a < b)
            System.out.printf("ArrayList better on %5.2f%%\n", k);
        else System.out.printf("LinkedList better on %8.2f%%\n", k);
    }

    public static void getSetTimeResult(ArrayList<String> x, LinkedList<String> y) {
        System.out.println("SetTime:");
        a = (double) test.getSetTime(x);
        b = (double) test.getSetTime(y);
        k = Math.abs(((a / b) - 1) * 100);
        if (a < b) {
            if (k < 100) System.out.printf("ArrayList better on %5.2f%%\n", k);
            else System.out.println("ArrayList absolutely better!");
        } else if (k < 100)
            System.out.printf("LinkedList better on %8.2f%%\n", k);
        else System.out.println("LinkedList absolutely better!");
    }

    public static void timeForGetResult(ArrayList<String> x, LinkedList<String> y) {
        System.out.println("timeForGet:");
        test.getAddTime(x);
        test.getAddTime(y);
        a = (double) test.timeForGet(x);
        b = (double) test.timeForGet(y);
        k = Math.abs(((a / b) - 1) * 100);
        if (a < b)
            System.out.printf("ArrayList better on %5.2f%%\n", k);
        else System.out.printf("LinkedList better on %8.2f%%\n", k);
    }

    public static void getRemoveIndexTimeResult(ArrayList<String> x, LinkedList<String> y) {
        System.out.println("RemoveIndex:");
        test.getAddTime(x);
        test.getAddTime(y);
        a = (double) test.getRemoveIndexTime(x);
        b = (double) test.getRemoveIndexTime(y);
        k = Math.abs(((a / b) - 1) * 100);
        if (a < b) {
            if (k < 100) System.out.printf("ArrayList better on %5.2f%%\n", k);
            else System.out.println("ArrayList absolutely better!");
        } else if (k < 100)
            System.out.printf("LinkedList better on %8.2f%%\n", k);
        else System.out.println("LinkedList absolutely better!");
    }
}


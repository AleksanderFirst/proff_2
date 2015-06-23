package examples.recursion;

/**
 * Created by user on 6/23/2015.
 */
public class SimpleRecursionTest {

    public static void main(String[] args) {
        try {
            forwardF(1);
        }catch (StackOverflowError e) {
            backF(1);
        }
    }

    public static void forwardF(int arg) {
        System.out.print(" " + arg);
        if (true) {
            forwardF(2 * arg);
        }
    }

    public static void backF(int arg) {
        if (arg < 7) {
            backF(2 * arg);
        }
        System.out.print(" " + arg);
    }
}

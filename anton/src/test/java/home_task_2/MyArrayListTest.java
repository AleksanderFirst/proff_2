package home_task_2;

import org.junit.Test;

import java.util.List;

/**
 * Created by Антон on 01.07.2015.
 */
public class MyArrayListTest {

    List<String> strings;

    @Test
    public void myArrayListTest(){
        strings = new MyArrayList<String>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");
        strings.add("H");
        strings.add("I");
        strings.add("J");
        strings.add("K");
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        strings.remove(0);
        System.out.println(strings);
    }
}

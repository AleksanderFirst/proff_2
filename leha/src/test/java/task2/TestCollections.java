package task2;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by oleksii on 06.07.2015.
 */
public class TestCollections {

    @Test
    public void testMyCollection()
    {
        LehaArrayList <String> myList = new LehaArrayList();
        myList.add("0");
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        myList.add("6");
        myList.add("7");
        myList.add("8");
        myList.add("9");
        myList.add("10");
        myList.add("11");

        myList.remove(5);
        for (int i=0; i<myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

    }

}

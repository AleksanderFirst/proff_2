package collection;

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
        strings.add("A");
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
        strings1.add("A");
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

}

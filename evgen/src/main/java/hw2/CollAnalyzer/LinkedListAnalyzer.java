package hw2.CollAnalyzer;

import java.util.LinkedList;

/**
 * Created by Евгений on 07.07.2015.
 */
public class LinkedListAnalyzer implements ICollectionAnalyzer{
    LinkedList<String> linkedList = new LinkedList<String>();

    @Override
    public long addInStart() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, "Something");}
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInMiddle() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() / 2, "Something");
        }
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInEnd() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add("Something");
        }
        return System.currentTimeMillis() - time;
    }

}

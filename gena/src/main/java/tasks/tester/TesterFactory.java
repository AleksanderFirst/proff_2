package tasks.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sigen on 7/7/2015.
 */
public class TesterFactory {
    public ICollectionTester setTester(Object list){
        if (list instanceof ArrayList){
            return new ArrayListTester((ArrayList)list);
        } else
        if (list instanceof LinkedList){
            return new LinkedListTester((LinkedList)list);
        } else {
            return null;
        }
    }
}

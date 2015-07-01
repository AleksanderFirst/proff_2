package home_task_2.CollectionAnalyzer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;


public class AnalyzerFactory {
    public static CollectionAnalyzer analyze(String collectionType) throws ClassNotFoundException {
        if (collectionType.equals(ArrayList.class.getSimpleName())) {
            return new CollectionAnalyzer(new ArrayList<String>());
        } else if (collectionType.equals(LinkedList.class.getSimpleName())) {
            return new CollectionAnalyzer(new LinkedList<String>());
        } else if (collectionType.equals(CopyOnWriteArrayList.class.getSimpleName())) {
            return new CollectionAnalyzer(new CopyOnWriteArrayList<String>());
        } else throw new ClassNotFoundException();
    }

}

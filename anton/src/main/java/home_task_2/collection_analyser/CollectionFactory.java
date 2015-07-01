package home_task_2.collection_analyser;

import home_task_2.MyArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by Антон on 01.07.2015.
 */
public class CollectionFactory {

    public ICollectionAnalyser analyseCollection(Collection c){
        if (c instanceof ArrayList){
            return new ArrayListAnalyserImpl();
        }
        else if (c instanceof LinkedList)
            return new LinkedListAnalyserImpl();
        else if (c instanceof MyArrayList)
            return new MyArrayListAnalyserImpl();
        else return null;
    }
}

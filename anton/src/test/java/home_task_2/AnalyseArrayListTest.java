package home_task_2;

import home_task_2.collection_analyser.AnalyseResult;
import home_task_2.collection_analyser.CollectionFactory;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Антон on 01.07.2015.
 */
public class AnalyseArrayListTest {

    CollectionFactory collectionFactory = new CollectionFactory();
    AnalyseResult analyseResult = new AnalyseResult();

    @Test
    public void analyseArrayListTest(){
        analyseResult.getResults(collectionFactory.analyseCollection(new ArrayList()));
        analyseResult.getResults(collectionFactory.analyseCollection(new MyArrayList()));
    }

  /*  public static void main(String[] args) {
        CollectionFactory collectionFactory = new CollectionFactory();
        AnalyseResult analyseResult = new AnalyseResult();
        analyseResult.getResults(collectionFactory.analyseCollection(new MyArrayList()));
    }*/
}

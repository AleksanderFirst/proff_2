package home_task_2.collection_analyser;

/**
 * Created by Антон on 01.07.2015.
 */
public interface ICollectionAnalyser {

    long getAddTime();
    long getContainsTime();
    long getRemoveIndexTime();
    long getGetTime();
    long getSetTime();
    long getAddIndexTime();
    long getRemoveObjectTime();
    long getIndexOfTime();
}

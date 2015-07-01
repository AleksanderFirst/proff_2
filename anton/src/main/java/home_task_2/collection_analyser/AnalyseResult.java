package home_task_2.collection_analyser;

/**
 * Created by Антон on 01.07.2015.
 */
public class AnalyseResult {

    public void getResults(ICollectionAnalyser ica){
        String result = "Result of " + ica.getClass() + ":\n" + ica.getAddTime() + " nanosecs - add\n" +
                ica.getRemoveIndexTime() + " nanosecs - removeIndex\n" +
                ica.getAddIndexTime() + " nanosecs - addIndex\n" +
                ica.getGetTime() + " nanosecs - getIndex\n" +
                ica.getIndexOfTime() + " nanosecs - indexOf\n" +
                ica.getSetTime() + " nanosecs - set\n" +
                ica.getRemoveObjectTime() + " nanosecs - removeObject\n";
        System.out.println(result);
    }
}

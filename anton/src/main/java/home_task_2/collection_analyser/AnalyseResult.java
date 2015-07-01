package home_task_2.collection_analyser;

/**
 * Created by Антон on 01.07.2015.
 */
public class AnalyseResult {

    public void getResults(ICollectionAnalyser ica){
        String result = "Result of " + ica.getClass() + ":\n" + ica.getAddTime() + " millisec - add\n" +
                ica.getRemoveIndexTime() + " millisec - removeIndex\n" +
                ica.getAddIndexTime() + " millisec - addIndex\n" +
                ica.getGetTime() + " millisec - getIndex\n" +
                ica.getIndexOfTime() + " millisec - indexOf\n" +
                ica.getSetTime() + " millisec - set\n" +
                ica.getRemoveObjectTime() + " millisec - removeObject\n";
        System.out.println(result);
    }
}

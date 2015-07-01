package home_task_2.CollectionAnalyzer;


public interface Analyzable {
    long getAddTime();

    long getAddToStartTime();

    long getSetFirstElementTime();

    long getSetLastElementTime();

    long getSetMiddleElementTime();

    long getTimeForGetFirstElement();

    long getTimeForGetLastElement();

    long getTimeForGetMiddleElement();

    long getDeletionTime();

    long getSearchTime();

}

package home_task_2.CollectionAnalyzer;


import java.util.List;

public class CollectionAnalyzer implements Analyzable {
    private List<String> collection;

    public CollectionAnalyzer(List<String> collection) {
        this.collection = collection;

    }

    public long getAddTime() {
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            collection.add("A");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getAddToStartTime() {
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            collection.add(0, "A");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getSetFirstElementTime() {
        for (int i = 0; i < 1000000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            collection.set(0, "B");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getSetLastElementTime() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.set(9999, "B");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getSetMiddleElementTime() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.set(5000, "B");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getTimeForGetFirstElement() {
        for (int i = 0; i < 1000000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            collection.get(0);
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getTimeForGetLastElement() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.get(9999);
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getTimeForGetMiddleElement() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.get(50000);
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getDeletionTime() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.remove(0);
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getSearchTime() {
        for (int i = 0; i < 10000; i++) {
            collection.add("A");
        }
        collection.add(6000, "B");
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            collection.contains("B");
        }
        return System.currentTimeMillis() - timeBefore;
    }
}

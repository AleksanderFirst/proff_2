package analZER;

import java.util.List;

public class ArrayAnalyzerImpl implements IColAnal {

    @Override
    public long getAddTime(List x) {                         //добавление по очереди
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            x.add("A");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    @Override
    public long getSetTime(List x) {                               //добавление по индексу
        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            x.add(0, "A");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    @Override
    public long timeForGet(List x) {                       //доступ по индексу
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            x.get(0);
        }
        return System.currentTimeMillis() - time;
    }

    @Override
    public long getRemoveIndexTime(List x) {            //удаление по индексу
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            x.remove(0);
        }
        return System.currentTimeMillis() - time;
    }
}

package analZER;

import java.util.List;

public interface IColAnal {
    long getAddTime(List x);
    long getSetTime(List x);
    long timeForGet(List x);
    long getRemoveIndexTime(List x);
}


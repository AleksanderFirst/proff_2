package home_task_1.ArraySum;

import java.util.Arrays;

public class ArraySum {
    public static int arraySum(int[] array) throws ArraySumException {
        if (array == null) throw new ArraySumException();
        if (array.length == 1) return array[0];
        int middleIndex = array.length / 2;
        int[] arrayLeft = Arrays.copyOfRange(array, 0, middleIndex);
        int[] arrayRight = Arrays.copyOfRange(array, middleIndex, array.length);
        return arraySum(arrayLeft) + arraySum(arrayRight);
    }
}

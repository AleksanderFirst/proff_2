package hw1.arraysTotalRecursion;

import java.util.Arrays;

public class ArraysTotalRecursion {
    public double arraysTotalRecursion(double[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        double[] firstHalf = Arrays.copyOfRange(arr, 0, arr.length / 2);
        double[] secondHalf = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        return arraysTotalRecursion(firstHalf) + arraysTotalRecursion(secondHalf);
    }
}

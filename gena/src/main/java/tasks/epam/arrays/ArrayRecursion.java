package tasks.epam.arrays;


import java.util.Arrays;

/**
 * Created by sigen on 6/29/2015.
 */
public class ArrayRecursion {
    public double findArraySum(double[] arr) {
        //if contains only one element - return it to sum
        if (arr.length == 1) return arr[0];
        double[] leftBranch = Arrays.copyOfRange(arr, 0, arr.length / 2);
        double[] rightBranch = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        return findArraySum(leftBranch) + findArraySum(rightBranch);
    }
}

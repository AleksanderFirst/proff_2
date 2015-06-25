package home_task_1.sum_of_elements_recursion;

/**
 * Created by Антон on 25.06.2015.
 */
public class SumElementRecursion {

    public static int summarize(int [] array, int begin, int end){
        int length = end - begin + 1;
        if (begin == end) return array[begin];
        return summarize(array,begin, begin + length/2 - 1) + summarize(array,begin + length/2,end);
    }

}

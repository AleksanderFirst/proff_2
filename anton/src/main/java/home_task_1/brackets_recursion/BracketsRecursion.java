package home_task_1.brackets_recursion;

/**
 * Created by Антон on 25.06.2015.
 */
public class BracketsRecursion {

    public static boolean CheckBrackets(Brackets brackets){
        int balance = 0;
        String sequence = brackets.getBrackets();
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == '(') balance++;
            if (sequence.charAt(i) == ')') balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }

    public static boolean RecursionCheckBrackets(Brackets brackets,int balance){
        String sequence = brackets.getBrackets();
        if (balance < 0) return false;
        if (sequence.isEmpty()) return (balance == 0);
        if (sequence.charAt(0) == '(') balance++;
        if (sequence.charAt(0) == ')') balance--;
        return RecursionCheckBrackets(new Brackets(sequence.substring(1)),balance);
    }
}

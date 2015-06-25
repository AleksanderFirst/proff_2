package home_task_1.BracketValidator;

public class BracketValidator {

    int count = 0;

    public void bracketsCounter(String s) {
        if (count < 0) count = Integer.MIN_VALUE;
        if (s.length() == 1) {
            if (s.equals("(")) count++;
            if (s.equals(")")) count--;
        } else {
            bracketsCounter(s.substring(0, s.length() / 2));
            bracketsCounter(s.substring(s.length() / 2));
        }
    }

    public static boolean isBracketsCorrect(String s) {
        BracketValidator b = new BracketValidator();
        b.bracketsCounter(s);
        return b.count == 0;
    }
}

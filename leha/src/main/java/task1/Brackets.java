package task1;

/**
 * Created by avasilenko on 26.06.2015.
 */
public class Brackets {

    boolean isCorrectBrackets(String str){
        if (str.length() == 0)
            return true;

        if (str.charAt(0) == '(' && str.indexOf(")") != -1)
        {
            return isCorrectBrackets(str.substring(1, str.indexOf(")")) + str.substring(str.indexOf(")")+1));
        }
        else return false;
    }
}


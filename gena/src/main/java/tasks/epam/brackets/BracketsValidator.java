package tasks.epam.brackets;

/**
 * Created by sigen on 6/29/2015.
 */
public class BracketsValidator {
    public boolean validate(String str, int index, int counter) {
        boolean valid;
        char arr[] = str.toCharArray();
        if(arr[0] ==')'){
            return false;
        }
        if (index < arr.length) {
            if (arr[index] == '(') {
                counter++;
            } else {
                if (arr[index] == ')') {
                    counter--;
                }
            }
            return validate(str, ++index, counter);
        } else {
            if (counter == 0) {
                valid = true;
            } else {
                valid = false;
            }
        }
        return valid;
    }
}

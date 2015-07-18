package task.recursion.string;

public class RecursionStringImp implements RecursionString {
	public void recursionStringFindExceptions(String scr) {
		if (scr.length() == 0) {
			return;
		}
		if ((scr.indexOf(")") - 1 >= 0) && scr.substring(scr.indexOf(")") - 1, scr.indexOf(")")).equals("(")) {
			recursionStringFindExceptions(
					scr.substring(0, scr.indexOf(")") - 1) + scr.substring(scr.indexOf(")") + 1, scr.length()));
		} else {
			throw new IllegalArgumentException(scr);
		}
	}
}

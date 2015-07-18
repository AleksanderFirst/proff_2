package task.recursion.string;



import org.junit.Test;

import task.recursion.string.RecursionString;
import task.recursion.string.RecursionStringImp;

public class TestRecursionStringImp {
	RecursionString recursionString = new RecursionStringImp();
	@Test
	public void test() {
		recursionString.recursionStringFindExceptions("((())()())");
	}
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		recursionString.recursionStringFindExceptions("((()())");
	}

}

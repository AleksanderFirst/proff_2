package Task1_2;



import org.junit.Test;

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

package TaskCreateArrayList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TaskCreateArrayListTest {
	@Test
	public void test() {
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		List<Integer> list3 = new MyArrayList<>();
		CollectionAnalysis ca = new CollectionAnalysis(list);
		System.out.println(ca.toString());
		CollectionAnalysis ca2 = new CollectionAnalysis(list2);
		System.out.println();
		System.out.println(ca2.toString());
		CollectionAnalysis ca3 = new CollectionAnalysis(list3);
		System.out.println();
		System.out.println(ca3.toString());
	}
}



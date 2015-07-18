package task.create.my.collection;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import shop.domain.Goods;
import task.create.my.collection.CollectionAnalysis;
import task.create.my.collection.MyArrayList;

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
		Set<Integer> list4 = new HashSet<>();
		CollectionAnalysis ca4 = new CollectionAnalysis(list4);
		System.out.println();
		System.out.println(ca4.toString());
		long a, b, c;
        BigDecimal d, e, f;
        a = 9223372036854775807l;
        b = a;
        c = a * b;
 
        d = BigDecimal.valueOf(a);
        e = BigDecimal.valueOf(b);
        f = d.multiply(e);
        Goods g = new Goods("sdf","dsf",f);
        System.out.println("(long)       " + a + " * " + b + " = " + c);
        System.out.println("(BigInteger) " + d.toString() + " * " + e.toString() + " = " + f.toString());
        System.out.println("(BigInteger) " + d.toString() + " * " + e.toString() + " = " + g.getPrice().toString());
	}
}



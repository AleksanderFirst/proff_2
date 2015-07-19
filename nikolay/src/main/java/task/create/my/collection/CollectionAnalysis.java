package task.create.my.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionAnalysis {
	
	private Collection<Integer> col;
	private Long addTime;
	private Long addToBegin;
	private Long addToMiddel;
	private Long addToEnd;
	private String SimpleClassName;
	private String SimpleInterfaceName;

	public CollectionAnalysis(Collection<Integer> e) {
		col = e;
		this.addTime = addTime();
		this.addToBegin = addToBegin();
		this.SimpleClassName = e.getClass().getSimpleName();
		this.SimpleInterfaceName = e.getClass().getInterfaces()[0].getSimpleName();
		switch (SimpleInterfaceName) {
		case "List": {
			this.addToMiddel = addToMiddel(((List<Integer>) e));
			this.addToEnd = addToEnd((List<Integer>) e);
		}
			break;
		case "Set": {
			this.addToMiddel = addToMiddel(((Set<Integer>) e));
			this.addToEnd = addToEnd((Set<Integer>) e);
		}
			break;

		default:
			break;
		}
	}

	private long addTime() {
		long timeBefore = System.nanoTime();
		for (int index = 0; index <= 1000000; index++) {
			col.add(index);
		}
		return System.nanoTime() - timeBefore;
	}

	private long addToBegin() {
		long timeBefore = System.nanoTime();
		Iterator<Integer> iterator = col.iterator();
		iterator.next();
		col.add(Integer.MAX_VALUE);
		return System.nanoTime() - timeBefore;
	}

	private long addToMiddel(List<Integer> list) {
		long timeBefore = System.nanoTime();
		list.add(500000, Integer.MIN_VALUE);
		return System.nanoTime() - timeBefore;
	}

	private long addToEnd(List<Integer> list) {
		long timeBefore = System.nanoTime();
		list.add(1000000, Integer.MIN_VALUE);
		return System.nanoTime() - timeBefore;
	}

	private long addToMiddel(Set<Integer> set) {
		long timeBefore = System.nanoTime();
		set.remove(500000);
		return System.nanoTime() - timeBefore;
	}

	private long addToEnd(Set<Integer> set) {
		long timeBefore = System.nanoTime();
		set.remove(1000000);
		return System.nanoTime() - timeBefore;
	}

	public String toString() {
		return "Interface : " + SimpleInterfaceName + "\n" + "Class : " + SimpleClassName + "\n" + "addTime : "
				+ addTime.doubleValue() / 1000000 + " ms\n" + "addToBegin : " + addToBegin.doubleValue() / 1000000
				+ " ms\n" + "addToMiddel :" + addToMiddel.doubleValue() / 1000000 + " ms\n" + "addToEnd : "
				+ addToEnd.doubleValue() / 1000000 + " ms";
	}
}

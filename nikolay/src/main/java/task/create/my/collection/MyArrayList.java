package task.create.my.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T>{
	private int CAPACITY = 10;
	private Object values[];
	private int size;
	public  MyArrayList(){
		values = new Object[CAPACITY];
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(size==0) return true;
		return false;
	}

	@Override
	public boolean contains(Object o) {
		for(Object c: Arrays.copyOfRange(values, 0, size)){
			if(c.equals(o)){
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Iterator iterator() {
		return Arrays.asList(Arrays.copyOfRange(values, 0, size)).iterator();
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOfRange(values, 0, size);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		checkSize();
		values[size++] = e;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		try {
			int index = indexOf(o);
		Object [] secondPartOfOldValues = Arrays.copyOfRange(values, index+1, size);
		values = Arrays.copyOf(Arrays.copyOfRange(values, 0, index), CAPACITY);
		size--;
		for(Object c:secondPartOfOldValues){
			values[index++] = c;
			}
		} catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean flag = false;
		Object obj;
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext()){
			obj = iterator.next();
			for(Object o:Arrays.copyOfRange(values, 0, size)){
				if(o.equals(obj)){
					flag = true;
					break;
				}
			}
			if(!flag){
				return false;
			}
			flag = false;
		}
		return true;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public boolean addAll(Collection c) {
		CAPACITY = ((size + c.size() - 2)*3/2)+1;
		values = Arrays.copyOf(values, CAPACITY);
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext()){
			add((T) iterator.next());
		}
		return true;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public boolean addAll(int index, Collection c) {
		CAPACITY = ((size + c.size() - 2)*3/2)+1;
		Iterator<?> iterator = c.iterator();
		int goalSize = size + c.size() - 2;
		Object [] secondPartOfOldValues = Arrays.copyOfRange(values, index, goalSize);;
		values = Arrays.copyOf(Arrays.copyOfRange(values, 0, index), CAPACITY);
		while(iterator.hasNext()){
			add((T) iterator.next());
			index++;
		}
		for(Object c1:secondPartOfOldValues){
			values[index++] = c1;
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		int [] removingIndex = new int[c.size()];
		int indexSize = 0;
		Object obj;
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext()){
			obj = iterator.next();
			for(int index = 0 ; index<size;index++){
				if(values[index].equals(obj)){
					removingIndex[indexSize++] = index;
					break;
				}
			}
		}
		removingIndex = Arrays.copyOfRange(removingIndex, 0, indexSize);
		if(indexSize == 0){
			return false;
		}
		Object oldValues[] = values.clone();
		Arrays.sort(removingIndex);
		removingIndex = Arrays.copyOf(removingIndex, indexSize+1);
		removingIndex[indexSize++] = size;
		values = Arrays.copyOf(Arrays.copyOfRange(values, 0, removingIndex[0]), ((size-indexSize-1)*3/2)+1);
		size = removingIndex[0];
		for(int index = 1;index < indexSize;index++){
			for(int indexOfCopy = removingIndex[index-1]+1;indexOfCopy < removingIndex[index];indexOfCopy++){
				values[size++] = oldValues[indexOfCopy];
			}
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		values = (Object[]) new Object[10];
		size = 0;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T)values[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(int index, Object element) {
		values[index] = (T)element;
		return values[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add(int index, Object element) {
		if(index<size){
			Object [] secondPartOfOldValues = Arrays.copyOfRange(values, index, size);
			values = Arrays.copyOf(Arrays.copyOfRange(values, 0, index), CAPACITY);
			values[index++] = (T)element;
			size++;
			for(Object c:secondPartOfOldValues){
				values[index++] = c;
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		Object [] secondPartOfOldValues = Arrays.copyOfRange(values, index+1, size);
		Object removingElement = values[index];
		values = Arrays.copyOf(Arrays.copyOfRange(values, 0, index), CAPACITY);
		size--;
		for(Object c:secondPartOfOldValues){
			values[index++] = c;
		}
		return  (T)removingElement;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int indexOf(Object o) {
		for(int index = 0;index < size;index++){
			if(values[index].equals((T)o)){
				return index;
			}
		}
		throw new IllegalArgumentException("������ �� ������");
	}

	@SuppressWarnings("unchecked")
	@Override
	public int lastIndexOf(Object o) {
		for(int index = size - 1;0 <= index;index--){
			if(values[index].equals((T)o)){
				return index;
			}
		}
		throw new IllegalArgumentException("������ �� ������");
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 && toIndex > size) {
			throw new IllegalArgumentException("��������� ������ ������� �� ���������� �������");
		}
		return Arrays.asList(Arrays.copyOfRange(values, fromIndex, toIndex));
	}
	private void checkSize(){
		if(size+1>CAPACITY){
			CAPACITY = (size*3/2)+1;
			values = Arrays.copyOf(values, CAPACITY);
		}
	}
	public String toString(){
		if(size == 0) return "";
		if(size == 1) return "[ "+values[0]+" ]";
		String scr ="[ "+values[0];
		for(int index = 1;index<size;index++){
			scr = scr + ", " + values[index];
		}
		scr+="]";
		return scr;
	}

}

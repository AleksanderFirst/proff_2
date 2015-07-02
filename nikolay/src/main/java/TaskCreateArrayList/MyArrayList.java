package TaskCreateArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T>{
	private int CAPACITY = 10;
	private T values[];
	private int size;
	public  MyArrayList(){
		values = (T[]) new Object[CAPACITY];
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		values[size] = e;
		setSize();
		return true;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		changeCapacity(size + c.size() - 2);
		List<T> list = (List) c;
		for (int index = 0; index < c.size(); index++) {
			add(list.get(index));
		}
		return true;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return values[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		if(index<size){
			
		}
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		for(int index = 0;index < values.length;index++){
			if(values[index].equals((T)o)){
				return index;
			}
		}
		throw new IllegalArgumentException("Объект не найден");
	}

	@Override
	public int lastIndexOf(Object o) {
		for(int index = values.length - 1;0 <= index;index--){
			if(values[index].equals((T)o)){
				return index;
			}
		}
		throw new IllegalArgumentException("Объект не найден");
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		if (fromIndex < 0 && toIndex > values.length) {
			throw new IllegalArgumentException("Указанный индекс выходит за допустимые пределы");
		}
		List<T> list = new MyArrayList<>();
		for (int index = fromIndex; index < toIndex; index++) {
			list.add(values[index]);
		}
		return list;
	}
	private int setSize(){
		if(size+1>CAPACITY){
			changeCapacity(size);
		}
		return size++;
	}
	private void changeCapacity(int size){
		CAPACITY = (size*3/2)+1;
		T oldValues[] = values.clone();
		values = (T[]) new Object[CAPACITY];
		size = 0;
		for(T c:oldValues){
			values[size] = c;
			size++;
		}
	}
	

}

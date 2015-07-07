package hw2;

import java.util.*;

public class MyArrayList<T> implements List<T>{
    private Object[] elementData;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArrayList(int enteredCapacity) throws Exception {
        if (enteredCapacity > 0) {
            this.elementData = new Object[enteredCapacity];
        }
        if (enteredCapacity < 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        }
        if (enteredCapacity < 0) {
            throw new Exception();
        }
    }

    public MyArrayList(){
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        elementData[size++] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) elementData[index];
    }

    @Override
    public T set(int index, T element) {
        if (index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        elementData[index] = element;
        return (T) elementData[index];
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        if (index < size) {
            int count = size - index - 1;
            Object[] oldObjects = elementData;
            Object o = elementData[index];
            System.arraycopy(oldObjects, index + 1, elementData, index, count);
            elementData[--size] = null;
            return (T) o;
        }
        else throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

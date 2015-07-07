package myArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArray<T> implements List<T> {

    private Object[] objects;
    private static int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArray() {
        this.objects = new Object [DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
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
        if (size + 1 > DEFAULT_CAPACITY) {
            Object[] temp = objects;
            DEFAULT_CAPACITY = ((3 * DEFAULT_CAPACITY) / 2 + 1);
            objects = new Object[DEFAULT_CAPACITY];
            System.arraycopy(temp, 0, objects, 0, size);
        }
        objects[size] = t;
        size++;
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
        if (size < index) throw new IndexOutOfBoundsException();
        return (T) objects[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        if (index <size&& index>-1){
            int nomMuved=size-index-1;
            System.arraycopy(objects,index+1,objects,index,nomMuved);
            objects[--size]=null;
            return null;
        }
        else throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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

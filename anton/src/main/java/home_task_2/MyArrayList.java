package home_task_2;

import java.util.*;

/**
 * Created by Антон on 01.07.2015.
 */
public class MyArrayList<T> implements List<T> {

    private Object [] objects;
    private static int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArrayList(){
        this.objects = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size > 0);
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean add(T t) {
        if (size + 1 > DEFAULT_CAPACITY){
            Object[] oldObjects = objects;
            DEFAULT_CAPACITY = ((3*DEFAULT_CAPACITY)/2 + 1);
            objects = new Object[DEFAULT_CAPACITY];
            System.arraycopy(oldObjects, 0, objects, 0, size);
        }
        objects[size] = t;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        int index = indexOf(o);
        remove(index);
        return true;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        objects = new Object[10];
        size = 0;
    }

    public T get(int index) {
        if (index < size)
        return (T)objects[index];
        else throw new IndexOutOfBoundsException();
    }

    public T set(int index, T element) {
        if (index < size){
            Object o = objects[size];
            objects[size] = element;
            return (T)o;
        }
        else throw new IndexOutOfBoundsException();
    }

    public void add(int index, T element) {
        if (index < size) {
            if (size + 1 > DEFAULT_CAPACITY) {
                Object[] oldObjects = objects;
                DEFAULT_CAPACITY = ((3*DEFAULT_CAPACITY)/2 + 1);
                objects = new Object[DEFAULT_CAPACITY];
                System.arraycopy(oldObjects, 0, objects, 0, index);
                objects[index] = element;
                System.arraycopy(oldObjects, index, objects, index + 1, size - index + 1);
            } else {
                System.arraycopy(objects, index, objects, index + 1, size - index + 1);
                objects[index] = element;
            }
        }
        else throw new IndexOutOfBoundsException();
        size++;
    }

    public T remove(int index) {
        if (index < size) {
            int count = size - index - 1;
            Object[] oldObjects = objects;
            Object o = objects[index];
            System.arraycopy(oldObjects, index + 1, objects, index, count);
            objects[--size] = null;
            return (T) o;
        }
        else throw new IndexOutOfBoundsException();
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (objects[i].equals(o)) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i++) {
            if (o.equals(objects[i])) return i;
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "objects=" + Arrays.toString(objects) +
                ", size=" + size +
                '}';
    }
}

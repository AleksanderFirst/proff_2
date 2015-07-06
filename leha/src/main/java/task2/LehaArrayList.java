package task2;

import java.util.*;

/**
 * Created by oleksii on 03.07.2015.
 */
public class LehaArrayList<T> implements List<T> {
    private Object[] objects;
    private static int DEFAULT_CAPACITY = 10;
    private int size;

    LehaArrayList()
    {
        objects = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
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

        if (objects.length > size) {
            objects[size] = t;
            size++;
        }
        else
        {
            int iNewSize;
            iNewSize = size*3/2+1;
            Object[] o = new Object [iNewSize];

            for (int i=0; i<size; i++ )
            {
                o[i] = objects[i];
            }

            o[size] = t;
            objects = o;
            size++;
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
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

    }

    public T get(int index) {
        if (index >= size)
        {
            throw new IndexOutOfBoundsException();
        }
        else return (T)objects[index];
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {

    }

    public T remove(int index) {
        int iCorr=0;

        for (int i=0; i<size; i++)
        {
            if (i == index) iCorr = 1;
            objects[i] = objects[i+iCorr];
        }
        size--;
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
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
}

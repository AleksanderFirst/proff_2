package home_task_2.MyOwnArrayList;


public class MyOwnArrayList<T> {
    Object[] array;

    private int size;

    public MyOwnArrayList() {
        array = new Object[10];
    }

    public MyOwnArrayList(int size) {
        array = new Object[size];
    }

    public int size() {
        return size;
    }

    public T set(int index, T value) {
        if (index < 0 || index > size - 2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T deletedValue = (T) array[index];
        array[index] = value;
        return deletedValue;
    }

    public T get(int index) {
        if (index < 0 || index > size - 2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int add(T value) {
        if (size == array.length) {
            Object[] temp = new Object[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            array[size] = value;
            size++;
        } else {
            array[size] = value;
            size++;
        }
        return size - 1;
    }

    public void add(int index, T value) {
        if (index < 0 || index > size - 2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == array.length) {
            Object[] temp = new Object[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = value;
            size++;
        } else {
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = value;
            size++;
        }
    }

    public T remove(int index) {
        if (index < 0 || index > size - 2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T deletedValue = get(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        if (size < array.length / 2) {
            Object[] temp = new Object[array.length / 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
        }
        return deletedValue;
    }


    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public int removeElement(T value) {
        int index = indexOf(value);
        remove(index);
        return index;
    }

    public boolean contains(T value) {
        for (Object o : array) {
            if (o == value) {
                return true;
            }
        }
        return false;
    }
}
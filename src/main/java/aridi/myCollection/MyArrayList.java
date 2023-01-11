package aridi.myCollection;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private Object[] array;
    private int counter = 0;
    private int capacity = 10;

    public MyArrayList() {
        array = new Object[capacity];
    }

    @Override
    public void add(E element) {
        if (counter == array.length) {
            grow();
        }
        array[counter++] = element;
    }

    @Override
    public void addAll(MyCollection<E> args) {
        Object[] array1 = args.toArray();
        while (capacity - counter - array1.length > 0) {
            grow();
        }
        for (int i = 0; i < args.size(); i++) {
            array[counter + i] = array1[i];
        }
    }

    @Override
    public E remove(int index) {
        if (index < capacity && index > 0) {
            Object o = array[index];
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            return (E) o;
        }
        throw new RuntimeException();
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Object[] toArray() {
        return this.array;
    }

    @Override
    public E get(int index) {
        if (index < capacity && index > 0) {
            return (E) array[index];
        } else {
            throw new RuntimeException();
        }
    }

    public void bubbleSort() {
//        if (this instanceof Comparable<?>) {
        boolean notSorted = true;
        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] == null) {
                    break;
                }
                if (((Comparable) array[i]).compareTo(array[i + 1]) > 0) {
                    Object a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    notSorted = true;
                }
            }
        }
//        }
//        else {
//            throw new RuntimeException();
//        }
    }


    private void grow() {
        Object[] array2 = new Object[(capacity = capacity * 2)];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

package ua.org.crazy.homework19.task01;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T item) {
        if (array.length == size) {
            increaseArray();
        }
        array[size] = item;
        size++;

    }

    private void increaseArray() {
        Object[] objects = new Object[size * 3 / 2];
        System.arraycopy(array, 0, objects, 0, size);
        this.array = objects;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return (T) array[index];
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Wrong index: " + index);
        }
    }

    @Override
    public T remove(int index) {
        Object[] arrayCopy;
        Object returnObj = array[index];

        if (index == 0) {
            arrayCopy = removeFirst(array);
        } else {
            if (index == array.length - 1) {
                arrayCopy = removeLast(array);
            } else {
                arrayCopy = removeMiddle(index, array);
            }
        }
        this.array = arrayCopy;
        return (T) returnObj;
    }

    private Object[] removeMiddle(int index, Object[] array) {
        Object[] arrayCopy = new Object[array.length - 1];
        System.arraycopy(array, 0, arrayCopy, 0, index);
        System.arraycopy(array, index + 1, arrayCopy, index, arrayCopy.length - index);
        return arrayCopy;
    }

    private Object[] removeLast(Object[] array) {
        Object[] arrayCopy = new Object[array.length - 1];
        System.arraycopy(array, 0, arrayCopy, 0, arrayCopy.length);
        return arrayCopy;
    }

    private Object[] removeFirst(Object[] array) {
        Object[] arrayCopy = new Object[array.length - 1];
        System.arraycopy(array, 1, arrayCopy, 0, arrayCopy.length);
        return arrayCopy;
    }

    @Override
    public void clear() {
        size = 0;
        array = new Object[DEFAULT_CAPACITY];
    }
}

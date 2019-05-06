package ua.org.crazy.homework19.task01;

/**
 *
 * @param <T>
 */
public interface MyList<T> {

    /**
     *
     * @return
     */
    int size();

    void add(T item);

    /**
     *
     * @param index
     * @return
     */
    T get(int index);

    T remove(int index);

    void clear();
}

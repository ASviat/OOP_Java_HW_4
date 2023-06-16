package Task04;

/**
 * Методы для добавления и получения элементов, а также методы для сортировки и
 * вывода элементов.
 */
public interface I_ToContainer<T> {
    void add(T element);

    T get(int index);

    void sort();

    void print();

}
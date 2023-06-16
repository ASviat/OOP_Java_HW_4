package Task04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * контейнер для хранения и обработки данных.
 */
public class DataContainer<T extends Comparable<T>> implements I_ToContainer<T> {
    ArrayList<T> myList;
    int counter;

    public DataContainer(int capacity) {
        ArrayList<T> mList = new ArrayList<>(capacity);
        myList = mList;
    }

    @Override
    public T get(int index) {

        return myList.get(index);
    }

    @Override
    public void add(T element) {
        myList.add(element);
    }

    @Override
    public void print() {
        for (T t : myList) {
            System.out.print(t + " ");

        }
    }

    @Override
    public void sort() {
        Collections.sort(myList, (o1, o2) -> o1.compareTo(o2));

    }

}
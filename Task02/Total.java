package Task02;

public class Total<T> {

    T[] myArray;

    public void printArray() {
        for (T t : myArray) {
            System.out.println(t);
        }
    }

    public Total(T[] x) {
        myArray = x;
    }

}
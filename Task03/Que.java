package Task03;

public class Que<T extends Comparable<T>> implements I_Comparable<T> {
    T e1;
    T e2;

    public Que(T e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public T getMax() {
        if (e1.compareTo(e2) > 0) {
            return e1;
        } else {
            return e2;
        }
    }

}
package Task01;

public class Elem<T> {

    T myElem;

    public void printElement() {
        System.out.println(myElem);
    }

    public Elem(T element) {

        myElem = element;
    }
}
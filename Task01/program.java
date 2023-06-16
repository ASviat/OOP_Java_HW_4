package Task01;

//  Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.

public class program {

    public static void main(String[] args) {

        Elem<Integer> myElem1 = new Elem<>(25);
        Elem<String> myElem2 = new Elem<String>("WAZZUP");
        Elem<Double> myElem3 = new Elem<Double>(1.23);

        myElem1.printElement();
        myElem2.printElement();
        myElem3.printElement();
    }
}
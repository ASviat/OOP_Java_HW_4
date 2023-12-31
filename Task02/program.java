package Task02;

// Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. 
// Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.

// В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. 
// В результате мы получаем вывод на консоль элементов каждого массива.

// Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, 
// обеспечивая повторное использование и гибкость.

public class program {

    public static void main(String[] args) {

        Integer[] myInt = { 25, 44 };
        String[] myStr = { "Четыре", "Слон", "Олег" };

        Total<Integer> myIntArr = new Total<>(myInt);
        Total<String> myStrArr = new Total<>(myStr);

        myIntArr.printArray();
        myStrArr.printArray();

    }
}
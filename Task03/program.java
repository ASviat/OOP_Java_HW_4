package Task03;

// Напишите обобщенную функцию getMax, которая принимает два параметра типа T 
// и возвращает максимальное значение из них.

public class program {
    public static void main(String[] args) {

        Que<Integer> queInt = new Que<>(25, 44);
        Que<Double> queDouble = new Que<>(3.8, -0.25);
        Que<String> queStr = new Que<>("Наполеон", "Слон");

        System.out.println(queInt.getMax());
        System.out.println(queDouble.getMax());
        System.out.println(queStr.getMax());
    }
}

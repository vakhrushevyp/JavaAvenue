package lesson11;

public class Example {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("До метода: a = " + a + ", b = " + b);
        swapNumbers(a, b);
        System.out.println("После метода: a = " + a + ", b = " + b);
    }

    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("В методе: a = " + a + ", b = " + b);
    }
}

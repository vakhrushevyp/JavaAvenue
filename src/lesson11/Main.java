package lesson11;

public class Main {
    public static void main(String[] args) {
        //1) Создать переменную ссылочного типа целого числа
        //2) Записать ее значение в переменную примитивного типа целого числа
        //3) Записать полученное значение в переменную строкового типа и вывести в консоль
        Integer linkTypeNumber = 25;
        int primitiveTypeNumber = linkTypeNumber;
        String stringTypeNumber = String.valueOf(primitiveTypeNumber);


        //1) Создать переменную примитивного типа для НЕ целых чисел
        //2) Записать ее значение в переменную ссылочного типа НЕ целого числа
        //3) Создать еще одну переменную ссылочного типа с другим значением
        //4) Сравнить и вывести в консоль больше ли переменная 1, чем переменная 2.

        double primitiveDouble = 40.5;
        Double notPrimitiveDouble1 = primitiveDouble;
        Double notPrimitiveDouble2 = 30.5;
        System.out.println(notPrimitiveDouble1 > notPrimitiveDouble2);

        System.out.println(notPrimitiveDouble1.compareTo(notPrimitiveDouble2));
        System.out.println(Double.compare(50.5, 60.5));
        System.out.println(Double.compare(notPrimitiveDouble1, notPrimitiveDouble2));

        double primitiveDNumber = 34.44;
        Double dNumber1 = primitiveDNumber;
        Double dNumber2 = 3453.345;

        if (dNumber1.compareTo(dNumber2) < 0) {
            System.out.println(dNumber1 + " меньше " + dNumber2);
        } else if (dNumber1.compareTo(dNumber2) > 0) {
            System.out.println(dNumber1 + " больше " + dNumber2);
        } else {
            System.out.println(dNumber1 + " равно " + dNumber2);
        }


    }
}

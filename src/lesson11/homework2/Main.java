package lesson11.homework2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int i = 10;
        String str = String.valueOf(i);
        System.out.println(str);

        String numbers = "1994";
        int num = Integer.parseInt(numbers);
        System.out.println(num);

        double number1 = 3.14;
        int number2 = (int) number1;
        System.out.println(number2);


        int[] array = {1, 5, 7, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        System.out.println(list);
    }
}

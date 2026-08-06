package lesson11.homework3;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(valueOf("4896"));
        System.out.println(integer);

        Integer int1 = 2001;
        Integer int2 = 1999;
        if (int1.equals(int2)) {
            System.out.println("Объекты равны");
        } else {
            System.out.println("Объекты не равны");
        }

        String str = "599";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}

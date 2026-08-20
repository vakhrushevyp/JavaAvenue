package lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим новое множество");
        Set<Integer> set = new TreeSet<>();
        System.out.println(set);

        set.add(4);
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(99);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(3);
        set.add(15);
        set.add(2);



        System.out.println("\n" + set);

        System.out.println("\nsize");
        System.out.println(set.size());

        System.out.println("\nisEmpty");
        System.out.println(set.isEmpty());

        System.out.println("\nremove");
        System.out.println(set.remove(99));
        System.out.println(set);

        System.out.println("\ncontains");
        System.out.println(set.contains(2) ? "присутствует" : "отсутствует");

        System.out.println("\nУдаляем все четные числа");
        //set.removeIf(number -> number % 2 == 0);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(set);













    }
}

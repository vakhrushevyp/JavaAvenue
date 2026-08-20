package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создадим новый список");
        List<Integer> list = new LinkedList<>();

        System.out.println("\nadd");
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(99);
        System.out.println(list);

        System.out.println("\nadd");
        list.add(3,15);
        System.out.println(list);

        System.out.println("\nremove");
        list.remove(2);
        System.out.println(list);

        System.out.println("\nset");
        list.set(0,99);
        System.out.println(list);

        System.out.println("\nget");
        System.out.println(list.get(0));

        System.out.println("\nindexOf");
        System.out.println(list.indexOf(99));

        System.out.println("\nlastIndexOf");
        System.out.println(list.lastIndexOf(99));

        System.out.println("\ncontains");
        System.out.println(list.contains(99));

        System.out.println("\nclear");
        list.clear();

        System.out.println(list.contains(99));

    }
}

package lesson13;

import java.util.*;

public class CollectionUtilsExample {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(8);
        listA.add(2);
        listA.add(4);
        listA.add(99);
        listA.add(8);
        listA.add(30);
        listA.add(40);
        listA.add(4);
        listA.add(5);

        List<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(3);
        listB.add(10);
        listB.add(40);
        listB.add(99);
        listB.add(5);
        listB.add(9);
        listB.add(2);
        listB.add(1);

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(8);
        setA.add(2);
        setA.add(4);
        setA.add(99);
        setA.add(8);
        setA.add(30);
        setA.add(40);
        setA.add(4);
        setA.add(5);

        Set<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(3);
        setB.add(10);
        setB.add(40);
        setB.add(99);
        setB.add(5);
        setB.add(9);
        setB.add(2);
        setB.add(1);

        CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();
        System.out.println("union:");
        System.out.println(collectionUtils.union(listA, listB));
        System.out.println("intersection:");
        System.out.println(collectionUtils.intersection(listA, listB));
        System.out.println("difference:");
        System.out.println(collectionUtils.difference(listA, listB));
        System.out.println("unionWithoutDuplicate:");
        System.out.println(collectionUtils.unionWithoutDuplicate(setA, setB));
        System.out.println("intersectionWithoutDuplicate:");
        System.out.println(collectionUtils.intersectionWithoutDuplicate(setA, setB));
    }

}

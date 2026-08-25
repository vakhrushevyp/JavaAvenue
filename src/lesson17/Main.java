package lesson17;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin2 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin3 = new Coin(10, 1999, "Золото", 2.5);
        Coin coin4 = new Coin(50, 1899, "Олово", 5);
        Coin coin5 = new Coin(5, 1869, "Серебро", 10);
        Coin coin6 = new Coin(5, 1869, "Палладий", 10);
        Coin coin7 = new Coin(5, 1869, "Палладий", 11);

        System.out.println("Вариант 1 - используем сортировку по умолчанию.");
        Set<Coin> coinSet = new TreeSet<>();
        coinSet.add(coin1);
        coinSet.add(coin2);
        coinSet.add(coin3);
        coinSet.add(coin4);
        coinSet.add(coin5);
        coinSet.add(coin6);
        coinSet.add(coin7);

        for (Coin coin : coinSet) {
            System.out.println(coin);
        }

        System.out.println("Вариант 2 - используем сортировку через внешний компаратор.");
        Set<Coin> coinSet2 = new TreeSet<>(new SortByYearComparator());
        coinSet2.add(coin1);
        coinSet2.add(coin2);
        coinSet2.add(coin3);
        coinSet2.add(coin4);
        coinSet2.add(coin5);
        coinSet2.add(coin6);
        coinSet2.add(coin7);

        for (Coin coin : coinSet) {
            System.out.println(coin);
        }

        System.out.println("Вариант 3 - используем сортировку через внешний компаратор.");
        Set<Coin> coinSet3 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сначала по номиналу по возрастанию
            if (o1.getNominal() != o2.getNominal()) {
                return o1.getNominal() - o2.getNominal();
            }

                //Потом по году по убыванию
            if (o1.getYear() != o2.getYear()) {
                return o2.getYear() - o1.getYear();
            }

                //Потом сортируем по диаметру по убыванию
            return Double.compare(o2.getDiameter(), o1.getDiameter());
            }
        });

        coinSet3.add(coin1);
        coinSet3.add(coin2);
        coinSet3.add(coin3);
        coinSet3.add(coin4);
        coinSet3.add(coin5);
        coinSet3.add(coin6);
        coinSet3.add(coin7);

        for (Coin coin : coinSet3) {
            System.out.println(coin);
        }




    }
}

package lesson17.hw;

import lesson17.Coin;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin2 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin3 = new Coin(10, 1999, "Олово", 2.5);
        Coin coin4 = new Coin(50, 1899, "Олово", 5);
        Coin coin5 = new Coin(5, 1869, "Серебро", 10);
        Coin coin6 = new Coin(5, 1869, "Палладий", 10);
        Coin coin7 = new Coin(5, 1869, "Палладий", 11);
        Coin coin8 = new Coin(15, 1999, "Серебро", 2.5);
        Coin coin9 = new Coin(10, 1899, "Золото", 11);

        System.out.println("Вариант 1 - используем сортировку через внешний компаратор.");
        Set<Coin> coinSet1 = new TreeSet<>(new SortByDiameterComparator());
        coinSet1.add(coin1);
        coinSet1.add(coin2);
        coinSet1.add(coin3);
        coinSet1.add(coin4);
        coinSet1.add(coin5);
        coinSet1.add(coin6);
        coinSet1.add(coin7);
        coinSet1.add(coin8);
        coinSet1.add(coin9);

        for (Coin coin : coinSet1) {
            System.out.println(coin);
        }

        System.out.println("Вариант 2 - используем сортировку через компаратор в виде анонимного класса.");
        Set<Coin> coinSet2 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //Сначала сортируем по металлу по возрастанию
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                //Потом сортируем по номиналу по убыванию
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                //Потом сортируем по диаметру по возрастанию
                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });

        coinSet2.add(coin1);
        coinSet2.add(coin2);
        coinSet2.add(coin3);
        coinSet2.add(coin4);
        coinSet2.add(coin5);
        coinSet2.add(coin6);
        coinSet2.add(coin7);
        coinSet2.add(coin8);
        coinSet2.add(coin9);

        for (Coin coin : coinSet2) {
            System.out.println(coin);
        }
    }
}

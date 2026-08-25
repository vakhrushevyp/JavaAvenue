package lesson17.hw;

import lesson17.Coin;

import java.util.Comparator;

public class SortByDiameterComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //Сначала сортируем по диаметру по убыванию
        if (o1.getDiameter() != o2.getDiameter()) {
            return Double.compare(o2.getDiameter(), o1.getDiameter());
        }

        //Потом сортируем по году по возрастанию
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        //Потом сортируем по металлу по убыванию
        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }

        //Потом сортируем по номиналу по возрастанию
        return o1.getNominal() - o2.getNominal();
    }
}

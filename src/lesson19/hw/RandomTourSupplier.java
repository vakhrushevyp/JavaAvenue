package lesson19.hw;

import java.util.function.Supplier;

public class RandomTourSupplier implements Supplier<Tour> {


    @Override
    public Tour get() {
        Tour[] tours = {
                new Tour("Турция", "Стамбул", "Самолет", 100_000, 5, 3, "завтрак"),
                new Tour("Турция", "Анталья", "Самолет", 150_000, 7, 5, "завтрак"),
                new Tour("Италия", "Рим", "Автобус", 150_000, 10, 4, "все включено"),
                new Tour("Турция", "Самсун", "Паром", 70000, 5, 2, "завтрак + обед"),
                new Tour("Германия", "Берлин", "Автобус", 135_000, 9, 4, "все включено"),
                new Tour("Россия", "Алтай", "Поезд", 78000, 4, 5, "завтрак"),
                new Tour("Иран", "Шираз", "Самолет", 80000, 5, 4, "завтрак"),
                new Tour("Шри-ланка", "Коломбо", "Самолет", 200_000, 10, 5, "все включено")
        };
        int number = (int) (Math.random() * tours.length);
        return tours[number];
    }
}

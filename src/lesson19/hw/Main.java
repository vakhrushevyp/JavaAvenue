package lesson19.hw;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("Фильтр туров в Турцию от 150000тыс только с завтраком через Predicate в виде отдельного класса:");
        TourFilterPredicate tourFilterPredicate = new TourFilterPredicate();
        for (Tour tour : tours) {
            if (tourFilterPredicate.test(tour)) {
                System.out.println(tour);
            }
        }

        System.out.println("\nФильтр туров не в Турцию, менее 100 тыс на самолете через Predicate в виде анонимной функции");
        Predicate<Tour> toursFilterPredicate = tour -> !tour.getCountry().equalsIgnoreCase("Турция") &&
                tour.getPrice() < 100000 &&
                tour.getTransport().equalsIgnoreCase("Самолет");
        for (Tour tour : tours) {
            if (toursFilterPredicate.test(tour)) {
                System.out.println(tour);
            }
        }

        System.out.println("\nФильтр туров в Турцию от 150000тыс только с завтраком через Consumer в виде отдельного класса:");
        TourFilterConsumer tourFilterConsumer = new TourFilterConsumer();
        for (Tour tour : tours) {
            tourFilterConsumer.accept(tour);
        }

        System.out.println("\nФильтр туров не в Турцию, менее 100 тыс на самолете через Consumer в виде анонимной функции");
        Consumer<Tour> toursFilterConsumer = tour -> {
            if (!tour.getCountry().equalsIgnoreCase("Турция") &&
                    tour.getPrice() < 100000 &&
                    tour.getTransport().equalsIgnoreCase("Самолет")) {
                System.out.println(tour);
            }
        };
        for (Tour tour : tours) {
            toursFilterConsumer.accept(tour);
        }

        System.out.println("\nВыведем рандомный тур из массива туров через Supplier в виде отдельного класса");
        RandomTourSupplier randomTourSupplier = new RandomTourSupplier();
        System.out.println(randomTourSupplier.get());

        System.out.println("\nВыведем рандомный тур из массива туров через Supplier в виде анонимной функции");
        Supplier<Tour> tourSupplier = () -> tours[(int) (Math.random() * tours.length)];
        System.out.println(tourSupplier.get());
    }
}

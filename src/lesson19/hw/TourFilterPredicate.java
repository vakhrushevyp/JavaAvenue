package lesson19.hw;

import java.util.function.Predicate;

public class TourFilterPredicate implements Predicate<Tour> {
    @Override
    public boolean test(Tour tour) {

        if (!tour.getCountry().equalsIgnoreCase("Турция")) {
            return false;
        }

        if (tour.getPrice() < 150000) {
            return false;
        }

        if (!tour.getFood().equalsIgnoreCase("завтрак")) {
            return false;
        }

        return true;
    }
}

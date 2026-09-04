package lesson19.hw;

import java.util.function.Consumer;

public class TourFilterConsumer implements Consumer<Tour> {


    @Override
    public void accept(Tour tour) {
        if (!tour.getCountry().equalsIgnoreCase("Турция")) {
            return;
        }

        if (tour.getPrice() < 150000) {
            return;
        }

        if (!tour.getFood().equalsIgnoreCase("завтрак")) {
            return;
        }

        System.out.println(tour);
    }
}

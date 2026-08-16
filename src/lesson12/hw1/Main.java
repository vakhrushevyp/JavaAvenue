package lesson12.hw1;

import lesson12.hw1.interfaces.Flyable;
import lesson12.hw1.interfaces.Quackable;
import lesson12.hw1.interfaces.Reproductable;
import lesson12.hw1.interfaces.Swimable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LiveDuck liveDuck = new LiveDuck("серый", 800, "Домашняя утка");
        PlushDuck plushDuck = new PlushDuck("розовый", 200, "Плюшевая утка");
        RubberDuck rubberDuck = new RubberDuck("желтый", 50, "Резиновая уточка");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(liveDuck);
        ducks.add(plushDuck);
        ducks.add(rubberDuck);

        for (Duck duck : ducks) {
            System.out.println("Я " + duck.getName());
            System.out.println("У меня " + duck.getColor() + " цвет");
            System.out.println("Мой вес " + duck.getWeight() + " грамм");

            if (duck instanceof Flyable) {
                ((Flyable) duck).fly();
            }

            if (duck instanceof Quackable) {
                ((Quackable) duck).quack();
            }

            if (duck instanceof Reproductable) {
                ((Reproductable) duck).reproduce();
            }
            if (duck instanceof Swimable) {
                ((Swimable) duck).swim();
            }

            System.out.println("");
        }
    }
}

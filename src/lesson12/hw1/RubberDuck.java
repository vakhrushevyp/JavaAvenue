package lesson12.hw1;

import lesson12.hw1.interfaces.Swimable;

public class RubberDuck extends Duck implements Swimable {
    public RubberDuck(String color, int weight, String name) {
        super(color, weight, name);
    }

    @Override
    public void swim() {
        System.out.println("Плаваю сколько угодно и не тону");
    }
}

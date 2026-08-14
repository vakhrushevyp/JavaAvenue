package lesson12.hw1;

import lesson12.hw1.interfaces.Quackable;
import lesson12.hw1.interfaces.Swimable;

public class PlushDuck extends Duck implements Quackable, Swimable {
    public PlushDuck(String color, int weight, String name) {
        super(color, weight, name);
    }

    @Override
    public void quack() {
        System.out.println("Сделаю Кря-кря если нажать на кнопку");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю пока не намокну");
    }
}

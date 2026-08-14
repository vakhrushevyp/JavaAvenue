package lesson12;

import lesson12.interfaces.Flyable;
import lesson12.interfaces.Huntable;
import lesson12.interfaces.Soundable;

public class Swan extends Animal implements Soundable, Huntable, Flyable {
    public Swan(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Ем корешки водорослей");
    }

    @Override
    public void walkByLegs() {
        System.out.println("Неуклюже передвигаюсь лапками");
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь на моллюсков и рыб");
    }

    @Override
    public void sound() {
        System.out.println("Издаю звонкие крики");
    }

    @Override
    public void fly() {
        System.out.println("Летаю очень далеко");
    }
}

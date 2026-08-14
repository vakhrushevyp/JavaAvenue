package lesson12;

import lesson12.interfaces.Huntable;
import lesson12.interfaces.Soundable;

public class Tiger extends Animal implements Huntable, Soundable {
    public Tiger(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Ем свежее мясо");
    }

    @Override
    public void walkByLegs() {
        System.out.println("Бегу на четырех ногах");
    }

    @Override
    public void hunt() {
        System.out.println("Быстро бегу за добычей>");
    }

    @Override
    public void sound() {
        System.out.println("Рычу на всех");
    }
}

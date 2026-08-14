package lesson12;

import lesson12.interfaces.Soundable;

public class Elephant extends Animal implements Soundable {
    public Elephant(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Хоботом рву траву и кладу в рот");
    }

    @Override
    public void walkByLegs() {
        System.out.println("Хожу медленно шагая");
    }

    @Override
    public void sound() {
        System.out.println("Издаю громкий рев");
    }
}

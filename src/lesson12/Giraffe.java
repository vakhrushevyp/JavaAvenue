package lesson12;

import lesson12.interfaces.Soundable;

public class Giraffe extends Animal {
    public Giraffe(String name, double weight, int age, String color) {
        super(name, weight, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Ем кусты и деревя");
    }

    @Override
    public void walkByLegs() {
        System.out.println("Хожу на длинных ногах");
    }

}

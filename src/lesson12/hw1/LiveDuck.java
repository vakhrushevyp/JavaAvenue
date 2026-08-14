package lesson12.hw1;

import lesson12.hw1.interfaces.Quackable;
import lesson12.hw1.interfaces.Reproductable;
import lesson12.hw1.interfaces.Swimable;
import lesson12.interfaces.Flyable;

public class LiveDuck extends Duck implements Flyable, Quackable, Reproductable, Swimable {
    public LiveDuck(String color, int weight, String name) {
        super(color, weight, name);
    }

    @Override
    public void quack() {
        System.out.println("Кря-кря");
    }

    @Override
    public void reproduce() {
        System.out.println("Утята, за мной!");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю и ныряю где хочу");
    }

    @Override
    public void fly() {
        System.out.println("Зимой улетаю в теплые края");
    }
}

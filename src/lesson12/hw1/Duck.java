package lesson12.hw1;

import java.util.Objects;

public class Duck {
    private String color;
    private int weight;
    private String name;

    public Duck(String color, int weight, String name) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return weight == duck.weight && Objects.equals(color, duck.color) && Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, name);
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

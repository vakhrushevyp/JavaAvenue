package lesson6.homework;

import java.util.Objects;

public class Animal {
    private double height;
    private double weight;
    private final String name;
    private final String color;
    private final int numberOfLegs;
    private String food;

    public Animal(String name, double height, double weight, String color, int numberOfLegs) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFood() {
        return food;
    }

    public void sayName(){
        System.out.println("Меня зовут " + name);
    }
    public void sayHeight(){
        System.out.println("Мой рост " + height + " сантиметров");
    }
    public void sayWeight(){
        System.out.println("Мой вес " + weight + " килограмм");
    }

    public void sayColor(){
        System.out.println("Мой цвет " + color);
    }

    public void sayNumberOfLegs(){
        System.out.println("У меня " + numberOfLegs + " лапки");
    }

    public void sayFood(){
        System.out.println("Моя любимая еда это " + food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.height, height) == 0 && Double.compare(animal.weight, weight) == 0 &&
                numberOfLegs == animal.numberOfLegs && Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) && Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, numberOfLegs, food);
    }
}

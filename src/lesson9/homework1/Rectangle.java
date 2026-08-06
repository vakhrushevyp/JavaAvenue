package lesson9.homework1;

public class Rectangle extends Shape{
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void calculateArea() {
        double s = side1 * side1;
        System.out.println("Площать прямоугольника равна: " + s);
    }
}

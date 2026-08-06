package lesson9.homework1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double s = Math.PI * radius * radius;
        System.out.println("Площать круга равна: " + s );
    }
}

package lesson9.homework1;public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.calculateArea();
        Rectangle rectangle = new Rectangle(15.5, 20.3);
        rectangle.calculateArea();
        Triangle triangle = new Triangle(10, 15, 20);
        triangle.calculateArea();
    }
}

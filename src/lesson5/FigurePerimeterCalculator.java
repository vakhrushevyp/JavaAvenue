package lesson5;

import java.util.Scanner;

public class FigurePerimeterCalculator {

    public static void main(String[] args) {
        System.out.println("Добрый день! Я калькулятор периметров фигур.");
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - круг");
        System.out.println("4 - трапеция");
        System.out.println("5 - овал");

        //Scanner - java класс, который имеет функционал работы с консолью на чтение и запись
        //System.in - на вход, читаем ввод
        //System.out - на выход, пишем в консоль

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону А");
            int a = scanner.nextInt();
            System.out.println("Введите сторону B");
            int b = scanner.nextInt();
            System.out.println("Введите сторону С");
            int c = scanner.nextInt();
            System.out.println("Периметр треугольника: " + MathUtils.calculatePerimeterTriangle(a, b, c));
        } else if (userChoice == 2) {
            System.out.println("Введите сторону квадрата");
            int a = scanner.nextInt();
            System.out.println("Периметр квадрата: " + MathUtils.calculatePerimeterSquare(a));
        } else if (userChoice == 3) {
            System.out.println("Введите радиус круга");
            int r = scanner.nextInt();
            System.out.println("Периметр круга: " + MathUtils.calculatePerimeterCircle(r));
        } else if (userChoice == 4) {
            System.out.println("Введите сторону А");
            int a = scanner.nextInt();
            System.out.println("Введите сторону B");
            int b = scanner.nextInt();
            System.out.println("Введите сторону С");
            int c = scanner.nextInt();
            System.out.println("Введите сторону D");
            int d = scanner.nextInt();
            System.out.println("Периметр трапеции: " + MathUtils.calculatePerimeterTrapezoid(a, b, c, d));
        } else if (userChoice == 5) {
            System.out.println("Введите длинную ось овала");
            int dLong = scanner.nextInt();
            System.out.println("Введите короткую ось овала");
            int dShort = scanner.nextInt();
            System.out.println("Периметр овала: " + MathUtils.calculatePerimeterOval(dLong, dShort));
        } else System.out.println("Нет фигуры под таким номером!");
    }
}

package lesson5;

/**
 * Создание метода
 * 1 - модификатор доступа
 * public - публичный, доступен внутри всего проекта
 * protected - доступ только внтури наследников
 * package - доступен только внутри пакета
 * private - доступен только внутри класса
 * <p>
 * 2 - static
 * обозначает статичность метода
 * <p>
 * 3 - возвращаемый тип
 * (void - ничего не возвращает или int, char, double  и так далее)
 * <p>
 * 4 - название метода (строится в глагольной форме - calculate, print...)
 * <p>
 * 5 - входящие параметры - передаются внутри круглых скобок ()
 * при объявлении метода (String name, int age)
 * <p>
 * 6 - тело метода, тот код, который выполняетеся при вызове метода, пишется внутри {}
 */


public class MathUtils {

    public static void calculatePerimeterAndPrint(double a, double b, double c) {
        double perimeter = a + b + c;
        System.out.println("Периметр треугольника: " + perimeter);
    }

    public static double calculatePerimeterTriangle(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculatePerimeterSquare(double a) {
        return  a * 4;
    }

    public static double calculatePerimeterCircle(double r) {
        return 2 * r * Math.PI;
    }

    public static double calculatePerimeterTrapezoid(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static double calculatePerimeterOval(double dLong, double dShort) {
        return 2 * Math.PI * Math.sqrt((dLong * dLong + dShort * dShort) / 8);
    }
}

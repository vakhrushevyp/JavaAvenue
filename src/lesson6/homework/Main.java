package lesson6.homework;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Васька", 25, 3, "белый", 4);
        cat1.setFood("рыба");
        Animal dog1 = new Animal("Рекс", 65, 20, "черный", 4);
        dog1.setFood("мясо");
        Animal cat2 = new Animal("Васька", 25, 3, "белый", 4);
        cat2.setFood("рыба");
        System.out.println("Первое животное рассказывает о себе:");
        cat1.sayName();
        cat1.sayHeight();
        cat1.sayWeight();
        cat1.sayFood();
        cat1.sayNumberOfLegs();
        cat1.sayColor();
        System.out.println();
        System.out.println("Читаем данные через Getter у второго животного:");
        System.out.println("Имя:" + dog1.getName());
        System.out.println("Рост:" + dog1.getHeight());
        System.out.println("Вес:" + dog1.getWeight());
        System.out.println("Цвет:" + dog1.getColor());
        System.out.println("Количество лап:" + dog1.getNumberOfLegs());
        System.out.println("Любимая еда:" + dog1.getFood());
        System.out.println();
        System.out.println("Проверяем что любимую еду, рост и вес - можно поменять");
        dog1.setFood("суп");
        dog1.setHeight(70);
        dog1.setWeight(25);
        System.out.println();
        System.out.println("Просим второе животное рассказать о себе, чтобы проверить какие данные поменялись:");
        dog1.sayName();
        dog1.sayHeight();
        dog1.sayWeight();
        dog1.sayFood();
        dog1.sayNumberOfLegs();
        dog1.sayColor();
        System.out.println();
        System.out.println("Сравниваем близнецов:");
        System.out.println(cat1.equals(cat2));
        System.out.println();
        System.out.println("Сравниваем не близнецов:");
        System.out.println(cat1.equals(dog1));
    }
}

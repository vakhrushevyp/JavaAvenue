package lesson18;

import java.util.Map;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("Творог", 400.0);
        fridge.putProduct("Молоко", 950.0);
        fridge.putProduct("Сок", 1000.0);
        fridge.putProduct("Сок", 500.0);
        fridge.putProduct("Сыр", 50.8);
        fridge.putProduct("Имбирь", 50.6);
        fridge.putProduct("Мясо", 1200.1);

        System.out.println("Вывод всех продуктов от Я до А");
        fridge.printAllProductsFromZtoA();

        System.out.println("\nВзять продукт из холодильника:");
        fridge.getProduct("Мясо", 1100);
        fridge.getProduct("Мясо", 400);

        System.out.println("\nВывести вес всех продуктов в холодильнике(сумма)");
        fridge.printProductsWeightSum();

        System.out.println("\nВывести вес конкретного продукта в холодильнике");
        fridge.printProductWeight("Молоко");
        fridge.printProductWeight("Мясо");

        System.out.println("\nВывести наименование продукта, который закончится первым");
        fridge.printProductMinWeight();

        System.out.println("\nВывести наименование продукта, которого больше всего");
        fridge.printProductMaxWeight();

        System.out.println("\nВывести все продукты (название + вес) по весу от большего к меньшему");
        fridge.printAllProductsSortedWeight();
    }
}

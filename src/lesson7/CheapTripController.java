package lesson7;

import java.util.Scanner;

public class CheapTripController {
    private CheapTripDB db = new CheapTripDB();
    private boolean isNeedContinue = true;

    public void start() {
        while (isNeedContinue) {
            //Печать меню
            printMenu();
            //Обработка запроса
            processRequest();
        }
    }

    private void processRequest() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        scanner.nextLine();

        if (userChoice == 1) {
            System.out.println("Куда вы хотите полететь?");
            String country = scanner.nextLine();
            db.searchByCountry(country);
        } else if (userChoice == 2) {
            System.out.println("В какой город хотите?");
            String city = scanner.nextLine();
            db.searchByCity(city);
        } else if (userChoice == 3) {
            int maxPriceDB = db.getMaxPrice();
            int minPriceDB = db.getMinPrice();
            System.out.println("Укажите максимальную цену в диапазоне от " + minPriceDB + " до " + maxPriceDB + " рублей");
            int maxPrice = scanner.nextInt();
            db.searchByMaxPrice(maxPrice);
        } else if (userChoice == 4) {
            System.out.println("Все туры:");
            db.outAllTours();
        } else if (userChoice == 5) {
            System.out.println("Укажите минимальное количество звезд");
            int stars = scanner.nextInt();
            int maxPriceDB = db.getMaxPrice();
            int minPriceDB = db.getMinPrice();
            System.out.println("Укажите максимальную цену в диапазоне от " + minPriceDB + " до " + maxPriceDB + " рублей");
            int maxPrice = scanner.nextInt();
            db.searByPriceAndStars(stars, maxPrice);
        } else if (userChoice == 0) {
            isNeedContinue = false;
            scanner.close();
        } else {
            System.out.println("Увы, нет такого фильтра");
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("Добрый день! Я ваш персональный гид.");
        System.out.println("Выберите фильтр, по которому вы хотите искать туры.");
        System.out.println("1 - поиск туров по стране.");
        System.out.println("2 - поиск туров по городу");
        System.out.println("3 - поиск туров по цене");
        System.out.println("4 - просмотр всех туров");
        System.out.println("5 - поиск туров по цене и по звездам");
        System.out.println("0 - выход");
    }
}

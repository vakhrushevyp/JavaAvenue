package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Double> products = new HashMap<>();

    public void putProduct(String productName, double productWeight) {
        if (products.containsKey(productName)) {
            double currentWeight = products.get(productName);
            products.put(productName, currentWeight + productWeight);
        } else {
            products.put(productName, productWeight);
        }
    }

    public void printAllProductsFromZtoA() {
        Set<String> keys = new TreeSet<>(Comparator.reverseOrder());
        keys.addAll(products.keySet());
        for (String key : keys) {
            System.out.println(key + ": " + products.get(key));
        }
    }

    public void getProduct(String productName, double productWeight) {
        if (products.containsKey(productName)) {
            double currentWeight = products.get(productName);
            if (currentWeight > productWeight) {
                double newWeight = currentWeight - productWeight;
                products.put(productName, newWeight);
                System.out.println("Вы взяли " + productName + ", в холодильнике осталось: " + newWeight);
            } else {
                double outProductWeight = Math.abs(currentWeight - productWeight);
                products.remove(productName);
                System.out.println("Вы взяли весь остаток продукта " + productName + " весом " + outProductWeight);
            }
        }
    }

    public void printProductsWeightSum() {
        double sumWeight = 0;
        for (Map.Entry<String, Double> entryProduct : products.entrySet()) {
            sumWeight += entryProduct.getValue();
        }
        System.out.println("Сумма веса всех продуктов: " + sumWeight);
    }

    public void printProductWeight(String productName) {
        if (products.containsKey(productName)) {
            System.out.println("Вес продукта " + productName + ": " + products.get(productName));
        } else {
            System.out.println("Продукта " + productName + " в холодильнике нет");
        }
    }

    public void printProductMinWeight() {
        double minWeight = Double.MAX_VALUE;
        for (Double value : products.values()) {
            if (value < minWeight) {
                minWeight = value;
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Double> productEntry : products.entrySet()) {
            if (productEntry.getValue() == minWeight) {
                list.add(productEntry.getKey());
            }
        }
        System.out.println("Продукт с минимальным весом: " + String.join(", ", list));
    }

    public void printProductMaxWeight() {
        double maxWeight = Double.MIN_VALUE;
        for (Double value : products.values()) {
            if (value > maxWeight) {
                maxWeight = value;
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Double> productEntry : products.entrySet()) {
            if (productEntry.getValue() == maxWeight) {
                list.add(productEntry.getKey());
            }
        }
        System.out.println("Продукт с максимальным весом: " + String.join(", ", list));
    }

    public void printAllProductsSortedWeight() {
        HashMap<String, Double> hashMap = new HashMap<>(products);
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        while (linkedHashMap.size() < products.size()) {
            Iterator<Map.Entry<String, Double>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                double maxWeight = Double.MIN_VALUE;
                for (Double value : hashMap.values()) {
                    if (value > maxWeight) {
                        maxWeight = value;
                    }
                }
                Map.Entry<String, Double> entry = iterator.next();
                if (entry.getValue() == maxWeight) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                    iterator.remove();
                }
            }
        }
        for (Map.Entry<String, Double> product : linkedHashMap.entrySet()) {
            System.out.println(product.getKey() + ": " + product.getValue());
        }
    }
}

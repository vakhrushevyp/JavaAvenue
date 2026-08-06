package lesson9.homework2;

public abstract class Hardware {
    private String name;
    private double price;
    private int quantity;

    public Hardware(String name, int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sell() {
        quantity -= 1;
        System.out.println("Осталось на складе: " + quantity);
    }

    public void upPrice() {
        price = price * 1.05;
        System.out.println("Новая стоимость: " + price);
    }

    public abstract void showFeature();
}

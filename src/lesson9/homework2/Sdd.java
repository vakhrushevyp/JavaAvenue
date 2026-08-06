package lesson9.homework2;

public class Sdd extends Hardware {
    private int memory;
    private int speed;

    public Sdd(String name, int price, int quantity, int memory, int speed) {
        super(name, price, quantity);
        this.memory = memory;
        this.speed = speed;
    }

    public void discountFifty() {
        System.out.println("Скидка 50%");
    }

    @Override
    public void showFeature() {
        System.out.println("Название: " + getName());
        System.out.println("Скорость: " + speed + " МБ/с");
        System.out.println("Размер памяти: " + memory + " Гб");
        System.out.println("Осталось на складе: " + getQuantity() + " шт.");
    }

}


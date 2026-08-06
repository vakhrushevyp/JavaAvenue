package lesson9.homework2;

public class Ram extends Hardware {
    private int frequency;
    private int memory;

    public Ram(String name, int price, int quantity, int frequency, int memory) {
        super(name, price, quantity);
        this.frequency = frequency;
        this.memory = memory;
    }

    public void oneAsAGift() {
        System.out.println("Вторая идет в подарок");
    }

    @Override
    public void showFeature() {
        System.out.println("Название: " + getName());
        System.out.println("Частота: " + frequency + " МГц");
        System.out.println("Размер памяти: " + memory + " Гб");
        System.out.println("Осталось на складе: " + getQuantity() + " шт.");
    }

}

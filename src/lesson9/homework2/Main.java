package lesson9.homework2;

public class Main {
    public static void main(String[] args) {
        Ram ram1 = new Ram("Samsung", 1200, 50, 4600, 8);
        Sdd sdd1 = new Sdd("AMD", 2500, 30, 500, 300);
        Ram ram2 = new Ram("Kingston", 1400, 10, 5200, 16);
        Sdd sdd2 = new Sdd("Kingston", 3500, 200, 1000, 400);
        ram1.sell();
        sdd2.sell();
        ram2.upPrice();
        sdd1.upPrice();
        Hardware[] hardwares = {ram1, sdd1, ram2, sdd2};

        System.out.println("Вывод товара:");
        for (Hardware hardware : hardwares) {
            hardware.showFeature();
            if (hardware instanceof Ram ram) {
                System.out.print("Идет акция - ");
                ram.oneAsAGift();
            }
            if (hardware instanceof Sdd) {
                System.out.print("Идет акция - ");
                ((Sdd) hardware).discountFifty();
            }
            System.out.println();
        }
    }
}

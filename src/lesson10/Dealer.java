package lesson10;

public class Dealer extends Player {
    public Dealer() {
        super("Дилер");
    }

    @Override
    public boolean isNeedNextCard() {
        return countPoints() < 17;
    }
}

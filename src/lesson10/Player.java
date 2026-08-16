package lesson10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final String name;
    private final ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * Положить карту в руку
     *
     * @param card карта
     */
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean isNeedNextCard() {
        int points = countPoints();
        if (points > 21) {
            System.out.println(name + ", у вас " + points + " очков. Вы проиграли!");
            return false;
        }
        System.out.println("\n" + name + ", хотите ли вы взять еще карту?");
        System.out.println("Карты у вас на руках:");
        for (Card card : hand) {
            System.out.println(card);
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("да");
    }

    public int countPoints() {
        int points = 0;
        for (Card card : hand) {
            points += card.getNominal();
        }
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hand);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}

package Lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    private Dealer dealer = new Dealer();
    private Deck deck = new Deck();
    private ArrayList<Player> players = new ArrayList<>();

    public void start(int playersQuantity) {

        if (playersQuantity < 1) {
            System.out.println("Слишком мало игроков. Добавьте хотя бы 1 игрока.");
            return;
        }

        if (playersQuantity > 5) {
            System.out.println("Превышено максимальное количество игроков (5).");
            return;
        }


        // 1 Создание игроков
        Scanner scanner = new Scanner(System.in);
        String playerName;
        players.add(dealer);
        for (int playerNumber = 1; playerNumber <= playersQuantity; playerNumber++) {
            System.out.println("Введите имя игрока " + playerNumber);
            playerName = scanner.next();
            players.add(new Player(playerName));
        }

        deck.refreshDeck();

        // 2 Раздать всем по 2 карты
        for (Player player : players) {
            Card card1 = deck.getRandomCard();
            Card card2 = deck.getRandomCard();
            player.addCardToHand(card1);
            player.addCardToHand(card2);
        }

        // 3 Раздать все остальные карты (пока игроки берут)
        for (Player player : players) {
            while (player.isNeedNextCard()) {
                player.addCardToHand(deck.getRandomCard());
            }
        }

        // 4 Печать результатов в консоль
        System.out.println("\nРезультаты:");
        for (Player player : players) {
            System.out.println(player.getName() + " набрал(а) " + player.countPoints() + " очков");
        }

        // 5 Определение победителя
        int maxPoints = 0;
        for (Player player : players) {
            if (!(player instanceof Dealer)) {
                int points = player.countPoints();
                if (points <= 21 && points >= maxPoints) {
                    maxPoints = points;
                }
            }
        }

        ArrayList<Player> winners = new ArrayList<>();
        for (Player player : players) {
            if (player instanceof Dealer) {
                int points = player.countPoints();
                if (points >= maxPoints && points <= 21) {

                    System.out.println("\nПобедителем стал " + player.getName());
                    break;
                }
            } else {
                if (player.countPoints() == maxPoints) {
                    winners.add(player);
                }
            }
        }

        if (winners.size() == 1) {
            System.out.println("\nПобедителем стал(а) " + winners.get(0).getName());
        } else if (winners.size() > 1) {
            System.out.println("\nПобедителями стали:");
            for (Player winner : winners) {
                System.out.println(winner.getName());
            }
        }
    }

}

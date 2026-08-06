package Lesson10;

public class Blackjack {
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
        // 2 Раздать всем по 2 карты
        // 3 Раздать все остальные карты (пока игроки берут)
        // 4 Печать результатов в консоль
        // 5 Определение победителя
    }
}

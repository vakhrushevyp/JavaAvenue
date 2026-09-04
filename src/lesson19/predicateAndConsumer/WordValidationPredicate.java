package lesson19.predicateAndConsumer;

import java.util.function.Predicate;

public class WordValidationPredicate implements Predicate<String> {

    @Override
    public boolean test(String word) {
        if (word == null || word.isEmpty()){
            return false;
        }

        String wordUpperCase = word.toUpperCase();

        if (!wordUpperCase.contains("Т")){
            return false;
        }
        if (!wordUpperCase.contains("Е")){
            return false;
        }
        if (wordUpperCase.contains("К")){
            return false;
        }

        return true;
    }
}

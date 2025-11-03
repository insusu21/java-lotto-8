package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = new ArrayList<>(numbers);
    }

    private void validate(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        if (numbers.size() != Constants.LOTTO_SIZE || numbers.size() != uniqueNumbers.size()) {
            throw new IllegalArgumentException(Constants.LOTTO_ERROR_MESSAGE);
        }
        for (int number : numbers) {
            if (number < Constants.MIN_LOTTO_NUMBER || number > Constants.MAX_LOTTO_NUMBER) {
                throw new IllegalArgumentException(Constants.LOTTO_ERROR_MESSAGE);
            }
        }
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(this.numbers);
    }

    public void lottoSort() {
        numbers.sort(Comparator.naturalOrder());
    }

}

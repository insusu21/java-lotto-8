package lotto;

import java.util.List;

public class WinningLotto {
    private final Lotto winningNumber;
    private final int bonusNumber;

    public WinningLotto(List<Integer> winningNumber, int bonusNumber) {
        this.winningNumber = new Lotto(winningNumber);
        this.bonusNumber = bonusNumber;
    }

    private int countMatches(Lotto lotto) {
        List<Integer> userNumbers = lotto.getNumbers();
        List<Integer> winning = winningNumber.getNumbers();
        int count = 0;
        for (int number : userNumbers) {
            if (winning.contains(number)) {
                count++;
            }
        }
        return count;
    }
}

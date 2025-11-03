package lotto;

import java.util.List;

public class WinningStatistic {
    public void countCalculate(List<Lotto> totalLotto, WinningLotto winningLotto) {
        for (Lotto lotto : totalLotto) {
            LottoPrize lottoPrize = winningLotto.match(lotto);
            lottoPrize.increaseCount();
        }
    }
}

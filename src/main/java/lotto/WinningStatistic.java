package lotto;

import java.util.List;

public class WinningStatistic {
    public void countCalculate(List<Lotto> totalLotto, WinningLotto winningLotto) {
        for (Lotto lotto : totalLotto) {
            LottoPrize lottoPrize = winningLotto.match(lotto);
            lottoPrize.increaseCount();
        }
    }

    public long calculateTotalPrize() {
        long totalPrize = 0L;
        for (LottoPrize prize : LottoPrize.values()) {
            if (prize == LottoPrize.LOSE) continue;
            totalPrize += ((long) prize.getPrize() * prize.getCount());
        }
        return totalPrize;
    }

    public double calculateRateOfReturn(int paid, long totalPrize) {
        if (paid == 0) {
            return 0.0;
        }
        return ((double) totalPrize / (double) paid) * 100.0;
    }
}

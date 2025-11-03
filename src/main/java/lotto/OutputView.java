package lotto;

import java.util.List;

public class OutputView {
    public void printTotalLotto(List<Lotto> totalLotto) {
        System.out.printf(Constants.PURCHASE_MESSAGE,totalLotto.size());
        System.out.println();

        for (Lotto lotto : totalLotto) {
            System.out.println(lotto.getNumbers());
        }
    }

    public void printWinningStatistic(double rateOfReturn) {
        System.out.println(Constants.STATISTICS_HEADER);
        System.out.println(Constants.STATISTICS_DIVIDING_LINE);
        for (LottoPrize prize : LottoPrize.values()) {
            if (prize == LottoPrize.LOSE) continue;

            String bonusText = "";
            if (prize.isBonusRequired()) {bonusText = Constants.BONUS_MATCH_TEXT;}

            System.out.printf(
                    Constants.STATISTICS_FORMAT, prize.getMatchCount(), bonusText, prize.getPrize(), prize.getCount());
        }
        System.out.printf(Constants.RATE_OF_RETURN_MESSAGE, rateOfReturn);
    }

}

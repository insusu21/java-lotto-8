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
}

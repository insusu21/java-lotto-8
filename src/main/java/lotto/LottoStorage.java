package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoStorage {
    public List<Lotto> lottoStore(int paid) {
        List<Lotto> totalLotto = new ArrayList<>();
        RandomNumber randomNumber = new RandomNumber();
        Calculator calculator = new Calculator();
        for (int i = 0; i < calculator.lottoAmountCalculate(paid); i++) {
            List<Integer> numbers = randomNumber.randomNumberGenerator();
            Lotto lotto = new Lotto(numbers);
            lotto.lottoSort();
            totalLotto.add(lotto);
        }
        return totalLotto;
    }
}

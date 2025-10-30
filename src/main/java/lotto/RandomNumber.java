package lotto;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    public List<Integer> randomNumberGenerator() {
        return new ArrayList<>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
    }
}
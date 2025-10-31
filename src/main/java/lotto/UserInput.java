package lotto;

import camp.nextstep.edu.missionutils.Console;

public class UserInput {
    private void validatePaid(int paid) {
        if (paid % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1000 단위의 숫자를 입력해주세요.");
        }
    }




}


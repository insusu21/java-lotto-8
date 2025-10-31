package lotto;

import camp.nextstep.edu.missionutils.Console;

public class UserInput {
    public int inputMoney() {
        while (true) {
            String input = Console.readLine();
            try{
                int paid = parseAndValidateInput(input);
                return paid;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validatePaid(int paid) {
        if (paid % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1000 단위의 숫자를 입력해주세요.");
        }
    }

    private int parseAndValidateInput(String input){
        int paid;
        try {
            paid = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 1000 단위의 숫자를 입력해주세요.");
        }

        validatePaid(paid);

        return paid;
    }


}


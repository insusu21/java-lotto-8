package lotto;

import camp.nextstep.edu.missionutils.Console;

public class UserInput {
    public int inputMoney() {
        while (true) {
            moneyNoticeWord();
            String input = Console.readLine();
            try{
                int paid = parseAndValidateInput(input);
                return paid;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void moneyNoticeWord() {
        System.out.println(Constants.MONEY_INPUT_MESSAGE);
    }

    private void validatePaid(int paid) {
        if (paid % 1000 != 0) {
            throw new IllegalArgumentException(Constants.INVALID_ERROR_MESSAGE);
        }
    }

    private int parseAndValidateInput(String input){
        int paid;
        try {
            paid = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Constants.INVALID_ERROR_MESSAGE);
        }

        validatePaid(paid);

        return paid;
    }


}


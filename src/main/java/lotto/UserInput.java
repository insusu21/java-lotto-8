package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserInput {
    // 구매 금액 입력
    public int inputMoney() {
        while (true) {
            moneyNoticeWord();
            String input = Console.readLine();
            try{
                int paid = parseAndValidateInputMoney(input);
                return paid;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void moneyNoticeWord() {
        System.out.println(Constants.INPUT_MONEY_MESSAGE);
    }

    private void validatePaid(int paid) {
        if (paid % Constants.LOTTO_PRICE_UNIT != 0) {
            throw new IllegalArgumentException(Constants.INVALID_ERROR_MESSAGE);
        }
    }

    private int parseAndValidateInputMoney(String input){
        int paid;
        try {
            paid = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Constants.INVALID_ERROR_MESSAGE);
        }

        validatePaid(paid);

        return paid;
    }

    // 당첨 번호 입력
    public List<Integer> inputWinningNumber() {
        while (true) {
            winningNumberNoticeWord();
            String input = Console.readLine();
            try{
                String[] winningNumberString = splitWinningNumber(input);
                List<Integer> winningNumber = parseWinningNumber(winningNumberString);
                validateNumberSize(winningNumber);
                validateNumberDuplicate(winningNumber);
                validateNumberRange(winningNumber);
                return winningNumber;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void winningNumberNoticeWord() {
        System.out.println(Constants.INPUT_WINNING_NUMBER_MESSAGE);
    }

    private String[] splitWinningNumber(String input) {
        return input.split(",");
    }

    private List<Integer> parseWinningNumber(String[] winningNumberString) {
        List<Integer> winningNumber = new ArrayList<>();
        try {
            for (String number : winningNumberString) {
                winningNumber.add(Integer.parseInt(number));
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Constants.WINNING_NUMBER_ERROR_MESSAGE);
        }

        return winningNumber;
    }

    private void validateNumberRange(List<Integer> winningNumber) {
        for (int number : winningNumber) {
            if (number < Constants.MIN_LOTTO_NUMBER || number > Constants.MAX_LOTTO_NUMBER) {
                throw new IllegalArgumentException(Constants.WINNING_NUMBER_ERROR_MESSAGE);
            }
        }
    }

    private void validateNumberSize(List<Integer> winningNumber) {
        if (winningNumber.size() != Constants.LOTTO_SIZE) {
            throw new IllegalArgumentException(Constants.WINNING_NUMBER_ERROR_MESSAGE);
        }
    }
    private void validateNumberDuplicate(List<Integer> winningNumber) {
        Set<Integer> uniqueNumbers = new HashSet<>(winningNumber);
        if (winningNumber.size() != uniqueNumbers.size()) {
            throw new IllegalArgumentException(Constants.WINNING_NUMBER_ERROR_MESSAGE);
        }
    }

}


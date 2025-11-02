package lotto;

public class Calculator {
    public int lottoAmountCalculate(int paid) {
        return paid / Constants.LOTTO_PRICE_UNIT;
    }
}

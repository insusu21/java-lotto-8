package lotto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void 로또_장수_계산_테스트() {
        Calculator calculator = new Calculator();
        int paid = 8000;
        int expectedAmount = 8;

        int lottoAmount = calculator.lottoAmountCalculate(8000);

        assertThat(lottoAmount).isEqualTo(expectedAmount);

    }
}

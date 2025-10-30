package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberTest {

    @Test
    void 랜덤_숫자_생성_테스트() {
        RandomNumber randomNumber = new RandomNumber();

        List<Integer> randomNumbers = randomNumber.randomNumberGenerator();

        assertThat(randomNumbers)
                .hasSize(6)
                .doesNotHaveDuplicates()
                .allSatisfy(number ->
                {assertThat(number)
                        .isGreaterThanOrEqualTo(1)
                        .isLessThanOrEqualTo(45);
                });
    }
}

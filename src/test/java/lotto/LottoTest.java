package lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @Test
    void 로또_번호의_개수가_6개가_넘어가면_예외가_발생한다() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void 로또_번호에_중복된_숫자가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 로또_번호_오름차순_정렬_테스트() {
        Lotto lotto = new Lotto(new ArrayList<>(List.of(8,4,2,3,21,45)));
        List<Integer> sortedLotto = List.of(2,3,4,8,21,45);
        lotto.lottoSort();

        assertThat(lotto.getNumbers()).isEqualTo(sortedLotto);
    }
    // TODO: 추가 기능 구현에 따른 테스트 코드 작성
}

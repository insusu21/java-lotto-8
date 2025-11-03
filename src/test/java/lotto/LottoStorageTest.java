package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoStorageTest {
    @Test
    void 로또는_요청한_장수만큼_반환한다() {
        LottoStorage lottoStorage = new LottoStorage();
        int paid = 5000;

        List<Lotto> lottos = lottoStorage.lottoStore(paid);

        assertThat(lottos).hasSize(5);
    }

}

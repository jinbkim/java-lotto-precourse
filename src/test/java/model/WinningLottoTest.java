package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WinningLottoTest {

    @Test
    void 로또_당첨_결과() {
        Lotto answer = new Lotto("1, 2, 3, 4, 5, 6");
        Lotto twoMatch = new Lotto("1, 2, 7, 8, 9, 10");
        Lotto threeMatch = new Lotto("1, 2, 3, 8, 9, 10");
        Lotto fourMatch = new Lotto("1, 2, 3, 4, 9, 10");
        Lotto fiveMatch = new Lotto("1, 2, 3, 4, 5, 10");
        Lotto sixMatch = new Lotto("1, 2, 3, 4, 5, 6");

        WinningLotto winningLottoBonus10 = new WinningLotto(answer, 10);
        WinningLotto winningLottoBonus6 = new WinningLotto(answer, 6);

        Assertions.assertThat(winningLottoBonus10.match(twoMatch))
            .isEqualTo(Rank.MISS);
        Assertions.assertThat(winningLottoBonus10.match(threeMatch))
            .isEqualTo(Rank.FIFTH);
        Assertions.assertThat(winningLottoBonus10.match(fourMatch))
            .isEqualTo(Rank.FOURTH);
        Assertions.assertThat(winningLottoBonus10.match(fiveMatch))
            .isEqualTo(Rank.THIRD);
        Assertions.assertThat(winningLottoBonus6.match(fiveMatch))
            .isEqualTo(Rank.SECOND);
        Assertions.assertThat(winningLottoBonus10.match(sixMatch))
            .isEqualTo(Rank.FIRST);
    }
}
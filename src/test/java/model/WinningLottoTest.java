package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WinningLottoTest {

    @Test
    void 당첨_통계_계산하기() {
        Lotto answer = new Lotto("1, 2, 3, 4, 5, 6");
        Lotto threeMatch = new Lotto("1, 2, 3, 7, 8, 9");
        Lotto fourMatch = new Lotto("1, 2, 3, 4, 8, 9");
        Lotto fiveMatch = new Lotto("1, 2, 3, 4, 5, 9");
        Lotto sixMatch = new Lotto("1, 2, 3, 4, 5, 6");

        WinningLotto winningLottoBonus9 = new WinningLotto(answer, 9);
        WinningLotto winningLottoBonus10 = new WinningLotto(answer, 10);

        Assertions.assertThat(winningLottoBonus9.match(threeMatch))
            .isEqualTo(Rank.FIFTH);
        Assertions.assertThat(winningLottoBonus9.match(fourMatch))
            .isEqualTo(Rank.FOURTH);
        Assertions.assertThat(winningLottoBonus10.match(fiveMatch))
            .isEqualTo(Rank.THIRD);
        Assertions.assertThat(winningLottoBonus9.match(fiveMatch))
            .isEqualTo(Rank.SECOND);
        Assertions.assertThat(winningLottoBonus9.match(sixMatch))
            .isEqualTo(Rank.FIRST);
    }
}
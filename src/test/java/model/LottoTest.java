package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LottoTest {

    @Test
    void 당첨번호_입력값_파싱하기() {
        Lotto lotto1 = new Lotto(" 1 , 2 , 3 , 4 , 5 , 6 ");
        Lotto lotto2 = new Lotto("1,2,3,4,5,6");

        Assertions.assertThat(lotto1.get())
            .contains(1, 2, 3, 4, 5, 6);
        Assertions.assertThat(lotto2.get())
            .contains(1, 2, 3, 4, 5, 6);
    }
}
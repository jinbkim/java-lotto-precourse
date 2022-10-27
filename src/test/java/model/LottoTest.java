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

    @Test
    void 정상적인_당첨번호_입력받기() {
        Assertions.assertThatCode(() -> new Lotto(" 1 , 2 , 3 , 4 , 5 , 6 "))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new Lotto("1,2,3,4,5,6"))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_당첨번호_입력받기() {
        Assertions.assertThatThrownBy(() -> new Lotto("a,2,3,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2a,3,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,0,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,46,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,4,4,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,4,5,6,7"));
    }
}
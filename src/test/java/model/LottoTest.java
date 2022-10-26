package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LottoTest {

    @Test
    void 정상적인_당첨_번호_입력받기() {
        Assertions.assertThatCode(() -> new Lotto("1,2,3,4,5,6"))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new Lotto("  1  ,  2  ,  3  ,  4  ,  5  ,  6  "))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_당첨_번호_입력받기() {
        Assertions.assertThatThrownBy(() -> new Lotto("1a,2,3,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("0,2,3,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("46,2,3,4,5,6"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,4,5,6,7"));
        Assertions.assertThatThrownBy(() -> new Lotto("1,2,3,4,,5,6"));
    }
}
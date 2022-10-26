package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BonusNumTest {

    @Test
    void 정상적인_보너스볼_입력받기() {
        Lotto lotto = new Lotto("3, 4 ,5, 6, 7, 8");
        Assertions.assertThatCode(() -> new BonusNum(lotto, "1"))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new BonusNum(lotto, "  2  "))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_보너스볼_입력받기() {
        Lotto lotto = new Lotto("3, 4 ,5, 6, 7, 8");
        Assertions.assertThatThrownBy(() -> new BonusNum(lotto, "a"));
        Assertions.assertThatThrownBy(() -> new BonusNum(lotto, "-1"));
        Assertions.assertThatThrownBy(() -> new BonusNum(lotto, "0"));
        Assertions.assertThatThrownBy(() -> new BonusNum(lotto, "46"));
        Assertions.assertThatThrownBy(() -> new BonusNum(lotto, "3"));
    }
}
package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BonusNumTest {

    @Test
    void 정상적인_보너스볼_입력받기() {
        Assertions.assertThatCode(() -> new BonusNum("1"))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new BonusNum("  2  "))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_보너스볼_입력받기() {
        Assertions.assertThatThrownBy(() -> new BonusNum("a"));
        Assertions.assertThatThrownBy(() -> new BonusNum("-1"));
        Assertions.assertThatThrownBy(() -> new BonusNum("0"));
        Assertions.assertThatThrownBy(() -> new BonusNum("46"));
    }
}
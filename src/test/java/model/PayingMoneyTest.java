package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PayingMoneyTest {

    @Test
    void 정상적인_구입급액_입력받기() {
        Assertions.assertThatCode(() -> new PayingMoney(" 3000 "))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_구입급액_입력받기() {
        Assertions.assertThatThrownBy(() -> new PayingMoney("1000a"));
        Assertions.assertThatThrownBy(() -> new PayingMoney("999"));
    }
}
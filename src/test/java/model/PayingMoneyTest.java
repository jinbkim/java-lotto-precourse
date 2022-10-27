package model;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PayingMoneyTest {

    @Test
    void 정상적인_구입금액_입력_받기() {
        Assertions.assertThatCode(() -> new PayingMoney(" 1 0 0 0 "))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new PayingMoney("1000"))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_구입금액_입력_받기() {
        Assertions.assertThatThrownBy(() -> new PayingMoney("a"));
        Assertions.assertThatThrownBy(() -> new PayingMoney("1a"));
        Assertions.assertThatThrownBy(() -> new PayingMoney("999"));
        Assertions.assertThatThrownBy(() -> new PayingMoney("-2000"));
        Assertions.assertThatThrownBy(() -> new PayingMoney("000"));
    }
}
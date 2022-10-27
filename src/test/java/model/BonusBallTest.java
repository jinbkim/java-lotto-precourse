package model;

import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BonusBallTest {

    @Test
    void 정상적인_보너스볼_입력받기() {
        Assertions.assertThatCode(() -> new BonusBall("  7  ", Arrays.asList(1, 2, 3, 4, 5, 6)))
            .doesNotThrowAnyException();
        Assertions.assertThatCode(() -> new BonusBall("7", Arrays.asList(1, 2, 3, 4, 5, 6)))
            .doesNotThrowAnyException();
    }

    @Test
    void 비정상적인_보너스볼_입력받기() {
        Assertions.assertThatThrownBy(() -> new BonusBall("a", Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertThatThrownBy(() -> new BonusBall("a7", Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertThatThrownBy(() -> new BonusBall("6", Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertThatThrownBy(() -> new BonusBall("0", Arrays.asList(1, 2, 3, 4, 5, 6)));
        Assertions.assertThatThrownBy(() -> new BonusBall("46", Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}
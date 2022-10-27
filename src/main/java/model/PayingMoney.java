package model;

import java.util.regex.Pattern;
import utils.Utils;

public class PayingMoney {

    private static final String ONLY_NUMBER_REGEX = "^[0-9]*$";

    private final int money;

    public PayingMoney(String input) {
        input = Utils.deleteAllSpace(input);
        validatePayingMoney(input);
        money = Integer.parseInt(input);
    }

    private void validatePayingMoney(String input) {
        if (!Pattern.matches(ONLY_NUMBER_REGEX, input) || Integer.parseInt(input) < 1000) {
            throw new IllegalArgumentException();
        }
    }

    public int getMoney() {
        return money;
    }
}

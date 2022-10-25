package model;

import Utils.Utils;
import java.util.regex.Pattern;

public class PayingMoney {

    private static final String PAYING_MONEY_REGEX = "^[0-9]*$";
    private static final int PAYING_MONEY_MIN = 1000;

    private final int money;

    public PayingMoney(String input) {
        validatePayingMoney(Utils.deleteAllSpace(input));
        money = Integer.parseInt(Utils.deleteAllSpace(input));
    }

    private void validatePayingMoney(String input) {
        if (!Pattern.matches(PAYING_MONEY_REGEX, input)) {
            throw new IllegalArgumentException();
        }
        if (Integer.parseInt(input) < PAYING_MONEY_MIN) {
            throw new IllegalArgumentException();
        }
    }
}

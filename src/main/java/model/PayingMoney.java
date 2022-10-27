package model;

import utils.Utils;

public class PayingMoney {

    private final int money;

    public PayingMoney(String input) {
        input = Utils.deleteAllSpace(input);
        validatePayingMoney(input);
        money = Integer.parseInt(input);
    }

    private void validatePayingMoney(String input) {
        if (!Utils.isNumber(input) || Integer.parseInt(input) < 1000) {
            throw new IllegalArgumentException();
        }
    }

    public int getMoney() {
        return money;
    }
}

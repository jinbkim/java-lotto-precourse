package model;

public class PayingMoney {

    private final int money;

    public PayingMoney(String input) {
        money = Integer.parseInt(input);
    }

    public int getMoney() {
        return money;
    }
}

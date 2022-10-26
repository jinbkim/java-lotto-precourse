package model;

public class BonusBall {

    private final int bonusBall;

    public BonusBall(String input) {
        bonusBall = Integer.parseInt(input);
    }

    public int getBonusBall() {
        return bonusBall;
    }
}

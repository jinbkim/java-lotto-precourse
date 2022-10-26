package model;

import Utils.Utils;
import java.util.regex.Pattern;

public class BonusNum {

    private static final String NUM_REGEX = "^[0-9]*$";
    private static final int LOTTO_NUM_MIN = 1;
    private static final int LOTTO_NUM_MAX = 45;

    private final int num;

    public BonusNum(String input) {
        input = Utils.deleteAllSpace(input);
        validateBonusNum(input);
        this.num = Integer.parseInt(input);
    }

    public int getNum() {
        return num;
    }

    private void validateBonusNum(String input) {
        if (!Pattern.matches(NUM_REGEX, input)) {
            throw new IllegalArgumentException();
        }
        if (Integer.parseInt(input) < LOTTO_NUM_MIN || Integer.parseInt(input) > LOTTO_NUM_MAX) {
            throw new IllegalArgumentException();
        }
    }
}

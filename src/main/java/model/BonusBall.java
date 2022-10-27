package model;

import java.util.List;
import java.util.regex.Pattern;
import utils.Utils;

public class BonusBall {

    private static final String ONLY_NUMBER = "^[0-9]*$";
    private static final int NUM_MIN = 1;
    private static final int NUM_MAX = 45;

    private final int bonusBall;

    public BonusBall(String input, List<Integer> winningNums) {
        input = Utils.deleteAllSpace(input);
        validateBonusBallForm(input);
        bonusBall = Integer.parseInt(input);
        validateBonusBall(winningNums);
    }

    private void validateBonusBall(List<Integer> winningNums) {
        if (winningNums.contains(bonusBall)) {
            throw new IllegalArgumentException();
        }
        if (bonusBall < NUM_MIN || bonusBall > NUM_MAX) {
            throw new IllegalArgumentException();
        }
    }

    private void validateBonusBallForm(String input) {
        if (!Pattern.matches(ONLY_NUMBER, input)) {
            throw new IllegalArgumentException();
        }
    }

    public int getBonusBall() {
        return bonusBall;
    }
}

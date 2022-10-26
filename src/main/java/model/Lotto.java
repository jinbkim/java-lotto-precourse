package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import utils.Utils;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {

    private static final int LOTTO_SIZE = 6;
    private static final int NUM_MIN = 1;
    private static final int NUM_MAX = 45;
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";
    private static final String NUM_JOIN_DELIMITER = ", ";

    private final List<Integer> numbers = new ArrayList<>();

    public Lotto() {
        while (numbers.size() <= LOTTO_SIZE) {
            addNum();
        }
    }

    private void addNum() {
        int randNum = Utils.createRandNum(NUM_MIN, NUM_MAX);

        if (!numbers.contains(randNum)) {
            numbers.add(randNum);
        }
    }

    @Override
    public String toString() {
        String numStr = numbers.stream()
            .map(num -> Integer.toString(num))
            .collect(Collectors.joining(NUM_JOIN_DELIMITER));

        return LEFT_BRACKET + numStr + RIGHT_BRACKET;
    }
}

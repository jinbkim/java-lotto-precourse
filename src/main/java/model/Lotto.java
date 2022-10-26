package model;

import Utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {

    private static final int LOTTO_NUM_MIN = 1;
    private static final int LOTTO_NUM_MAX = 45;
    private static final int LOTTO_NUM_SIZE = 6;
    private static final String LEFT_BRACKET = "[";
    private static final String RIGHT_BRACKET = "]";
    private static final String LOTTO_NUM_DELIMITER = ", ";
    private static final String LOTTO_NUM_SPLIT_REGEX = ",";

    private final List<Integer> numbers;

    public Lotto() {
        numbers = new ArrayList<>();
        while (numbers.size() < LOTTO_NUM_SIZE) {
            int randNum = Utils.createRandNum(LOTTO_NUM_MIN, LOTTO_NUM_MAX);

            if (!numbers.contains(randNum)) {
                numbers.add(randNum);
            }
        }
    }

    public Lotto(String input) {
        numbers = Arrays.stream(input.split(LOTTO_NUM_SPLIT_REGEX))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return LEFT_BRACKET + numbers.stream()
            .map(number -> number.toString())
            .collect(Collectors.joining(LOTTO_NUM_DELIMITER)) + RIGHT_BRACKET;
    }
}

package model;

import Utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
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
    private static final String LOTTO_INPUT_REGEX = "^[0-9]*,[0-9]*,[0-9]*,[0-9]*,[0-9]*,[0-9]*$";

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
        input = Utils.deleteAllSpace(input);
        validateLottoInput(input);
        numbers = Arrays.stream(input.split(LOTTO_NUM_SPLIT_REGEX))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        validateLottoNum(numbers);
    }

    @Override
    public String toString() {
        return LEFT_BRACKET + numbers.stream()
            .map(number -> number.toString())
            .collect(Collectors.joining(LOTTO_NUM_DELIMITER)) + RIGHT_BRACKET;
    }

    private void validateLottoInput(String input) {
        if (!Pattern.matches(LOTTO_INPUT_REGEX, input)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateLottoNum(List<Integer> numbers) {
        numbers.forEach(num -> {
            if (num < LOTTO_NUM_MIN || num > LOTTO_NUM_MAX) {
                throw new IllegalArgumentException();
            }
        });
    }

}

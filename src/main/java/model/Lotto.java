package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
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
    private static final String NUM_SPLIT_DELIMITER = ",";
    private static final String LOTTO_FORM_REGEX = "^[0-9]*,[0-9]*,[0-9]*,[0-9]*,[0-9]*,[0-9]$";

    private final List<Integer> numbers;

    public Lotto() {
        numbers = new ArrayList<>();
        while (numbers.size() < LOTTO_SIZE) {
            addNum();
        }
    }

    public Lotto(String input) {
        input = Utils.deleteAllSpace(input);
        validateLottoForm(input);
        numbers = Arrays.stream(input.split(NUM_SPLIT_DELIMITER))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        validateLottoNum();
    }

    public int countMatch(Lotto lotto) {
        return (int) numbers.stream()
            .filter(num -> lotto.numbers.contains(num))
            .count();
    }

    public boolean isMatch(int num) {
        return numbers.contains(num);
    }

    private void validateLottoNum() {
        int invalidateNumCount = (int) numbers.stream()
            .filter(num -> num > NUM_MAX || num < NUM_MIN)
            .count();
        boolean isDuplicated = numbers.stream()
            .distinct()
            .count() != LOTTO_SIZE;

        if (invalidateNumCount > 0 || isDuplicated) {
            throw new IllegalArgumentException();
        }
    }

    private void validateLottoForm(String input) {
        if (!Pattern.matches(LOTTO_FORM_REGEX, input)) {
            throw new IllegalArgumentException();
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

    public List<Integer> get() {
        return numbers;
    }
}

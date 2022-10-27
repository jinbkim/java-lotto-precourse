package utils;

import java.util.Random;
import java.util.regex.Pattern;

public class Utils {

    private static final String SPACE_REGEX = "\\s";
    private static final String ONLY_NUMBER_REGEX = "^[0-9]*$";

    public static int createRandNum(int numMin, int numMax) {
        return new Random().nextInt(numMax) + numMin;
    }

    public static String deleteAllSpace(String input) {
        return input.replaceAll(SPACE_REGEX, "");
    }

    public static boolean isNumber(String input) {
        return Pattern.matches(ONLY_NUMBER_REGEX, input);
    }
}

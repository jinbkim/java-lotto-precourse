package utils;

import java.util.Random;

public class Utils {

    private static final String SPACE_REGEX = "\\s";

    public static int createRandNum(int numMin, int numMax) {
        return new Random().nextInt(numMax) + numMin;
    }

    public static String deleteAllSpace(String input) {
        return input.replaceAll(SPACE_REGEX, "");
    }
}

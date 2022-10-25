package Utils;

import java.util.Random;

public class Utils {

    private static final String SPACE_REGEX = "\\s";

    public static String deleteAllSpace(String input) {
        return input.replaceAll(SPACE_REGEX, "");
    }

    public static int createRandNum(int minNum, int maxNum) {
        Random random = new Random();

        return random.nextInt(maxNum) + minNum;
    }
}

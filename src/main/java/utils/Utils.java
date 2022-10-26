package utils;

import java.util.Random;

public class Utils {

    public static int createRandNum(int numMin, int numMax) {
        return new Random().nextInt(numMax) + numMin;
    }
}

package utils;

import java.util.Arrays;

public class ResultUtils {

    public static void printResult(int[] result, int[] expect) {
        if (Arrays.equals(result, expect)) {
            System.out.println(true);
        } else {
            System.out.println(false + ", result:" + Arrays.toString(result) + ", expect:" + Arrays.toString(expect));
        }
    }

}

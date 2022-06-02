package utils;

import java.util.Arrays;

public class ResultUtils {

    public static void printResult(int[] result, int[] expect) {
        if (Arrays.equals(result, expect)) {
            System.out.println("pass");
        } else {
            System.out.println("fail! result:" + Arrays.toString(result) + ", expect:" + Arrays.toString(expect));
        }
    }

    public static void printResult(boolean result, boolean expect) {
        if (result == expect) {
            System.out.println("pass");
        } else {
            System.out.println("fail! result:" + result + ", expect:" + expect);
        }
    }

}

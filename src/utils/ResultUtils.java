package utils;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ResultUtils {

    public static <T> void printResult(T result, T expect,
                                       BiFunction<T, T, java.lang.Boolean> compare,
                                       Function<T, String> toString) {
        if (compare.apply(result, expect)) {
            System.out.println("pass");
        } else {
            System.out.println("fail! result:" + toString.apply(result) + ", expect:" + toString.apply(expect));
        }
    }

    public static void printResult(Object result, Object expect) {
        printResult(result, expect, (var r, var e) -> r.equals(e), Object::toString);
    }

    public static void printResult(int[] result, int[] expect) {
        printResult(result, expect, (var r, var e) -> Arrays.equals(result, expect), Arrays::toString);
    }

}

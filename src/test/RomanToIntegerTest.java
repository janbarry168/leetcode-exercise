package test;

import problem.RomanToInteger;
import solution.RomanToIntegerImpl;
import utils.ResultUtils;

public class RomanToIntegerTest {

    public static void main(String[] args) {
        test(new RomanToIntegerImpl());
    }

    private static void test(RomanToInteger romanToIntegerImpl) {
        int result;
        result = romanToIntegerImpl.romanToInt("III");
        ResultUtils.printResult(result, 3);

        result = romanToIntegerImpl.romanToInt("LVIII");
        ResultUtils.printResult(result, 58);

        result = romanToIntegerImpl.romanToInt("MCMXCIV");
        ResultUtils.printResult(result, 1994);
    }

}

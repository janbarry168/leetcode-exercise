package test;

import problem.IntegerToRoman;
import solution.IntegerToRomanImpl;
import utils.ResultUtils;

public class IntegerToRomanTest {

    public static void main(String[] args) {
        test(new IntegerToRomanImpl());
    }

    private static void test(IntegerToRoman integerToRomanImpl) {
        String result;
        result = integerToRomanImpl.intToRoman(3);
        ResultUtils.printResult(result, "III");

        result = integerToRomanImpl.intToRoman(58);
        ResultUtils.printResult(result, "LVIII");

        result = integerToRomanImpl.intToRoman(1994);
        ResultUtils.printResult(result, "MCMXCIV");
    }

}

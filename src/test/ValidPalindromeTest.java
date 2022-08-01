package test;

import problem.ValidPalindrome;
import solution.ValidPalindromeTwoPointerImpl;
import utils.ResultUtils;

public class ValidPalindromeTest {

    public static void main(String[] args) {
        test(new ValidPalindromeTwoPointerImpl());
    }

    private static void test(ValidPalindrome validPalindromeImpl) {
        boolean result;
        result = validPalindromeImpl.isPalindrome("A man, a plan, a canal: Panama");
        ResultUtils.printResult(result, true);

        result = validPalindromeImpl.isPalindrome("race a car");
        ResultUtils.printResult(result, false);

        result = validPalindromeImpl.isPalindrome(" ");
        ResultUtils.printResult(result, true);

        result = validPalindromeImpl.isPalindrome("a.");
        ResultUtils.printResult(result, true);

        result = validPalindromeImpl.isPalindrome("ab");
        ResultUtils.printResult(result, false);
    }

}

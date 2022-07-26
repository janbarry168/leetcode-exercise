package test;

import problem.PalindromeNumber;
import solution.PalindromeNumberReverseImpl;
import solution.PalindromeNumberReverseOptImpl;
import solution.PalindromeNumberTwoPointerImpl;
import utils.ResultUtils;

public class PalindromeNumberTest {

    public static void main(String[] args) {
        test(new PalindromeNumberTwoPointerImpl());
        test(new PalindromeNumberReverseImpl());
        test(new PalindromeNumberReverseOptImpl());
    }

    private static void test(PalindromeNumber PalindromeNumberImpl) {
        boolean result;
        result = PalindromeNumberImpl.isPalindrome(121);
        ResultUtils.printResult(result, true);

        result = PalindromeNumberImpl.isPalindrome(-121);
        ResultUtils.printResult(result, false);

        result = PalindromeNumberImpl.isPalindrome(100);
        ResultUtils.printResult(result, false);

        result = PalindromeNumberImpl.isPalindrome(0);
        ResultUtils.printResult(result, true);

        result = PalindromeNumberImpl.isPalindrome(5);
        ResultUtils.printResult(result, true);
    }
}

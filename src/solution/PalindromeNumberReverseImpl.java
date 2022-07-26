package solution;

import problem.PalindromeNumber;

/**
 * time: O(n) >> 13 ms, faster than 70.64%
 * space: O(1) >> 44.2 MB, less than 71.97%
 */
public class PalindromeNumberReverseImpl implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }

}

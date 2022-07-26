package solution;

import problem.PalindromeNumber;

/**
 * time: O(n/2) >> 9 ms, faster than 98.58%
 * space: O(1) >> 41.5 MB, less than 95.95%
 */
public class PalindromeNumberReverseOptImpl implements PalindromeNumber {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x || reverse/10 == x;
    }

}

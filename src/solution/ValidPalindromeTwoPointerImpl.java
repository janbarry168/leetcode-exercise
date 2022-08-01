package solution;

import problem.ValidPalindrome;

/**
 * time: O(n) >> 3 ms, faster than 98.95%
 * space: O(1) >> 42.4 MB, less than 93.16%
 */
public class ValidPalindromeTwoPointerImpl implements ValidPalindrome {

    @Override
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();

        int head = 0;
        int tail = charArray.length - 1;
        while (head <= tail) {
            char headChar = charArray[head];
            while (!Character.isLetterOrDigit(headChar) && ++head <= tail) {
                headChar = charArray[head];
            }
            char tailChar = charArray[tail];
            while (!Character.isLetterOrDigit(tailChar) && head <= --tail) {
                tailChar = charArray[tail];
            }

            if (headChar == tailChar) {
                head++;
                tail--;
            } else {
                return false;
            }
        }

        return true;
    }

}

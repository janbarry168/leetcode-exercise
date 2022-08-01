package solution;

import problem.ValidPalindrome;

/**
 * time: O(n) >> 5 ms, faster than 78.18%
 * space: O(1) >> 43.8 MB, less than 55.17%
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
            if (!Character.isLetterOrDigit(headChar)) {
                head++;
                continue;
            }
            char tailChar = charArray[tail];
            if (!Character.isLetterOrDigit(tailChar)) {
                tail--;
                continue;
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

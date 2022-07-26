package solution;

import problem.PalindromeNumber;

/**
 * time: O(n) >> 13 ms, faster than 70.64%
 * space: O(1) >> 46 MB, less than 17.18%
 */
public class PalindromeNumberTwoPointerImpl implements PalindromeNumber {
    
    @Override
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        char[] charArray = s.toCharArray();
        int head = 0;
        int tail = charArray.length - 1;
        while (head <= tail) {
            if (charArray[head] != charArray[tail]) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}

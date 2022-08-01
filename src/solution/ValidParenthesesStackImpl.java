package solution;

import problem.ValidParentheses;

import java.util.Stack;

/**
 * time: O(n) >> 1 ms, faster than 99.61%
 * space: O(n/2) >> 39.9 MB, less than 99.12%
 */
public class ValidParenthesesStackImpl implements ValidParentheses {

    @Override
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                charStack.add(charArray[i]);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char c = charStack.pop();
                if (c == '(' && charArray[i] == ')'
                    || c == '[' && charArray[i] == ']'
                    || c == '{' && charArray[i] == '}') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!charStack.isEmpty()) {
            return false;
        }
        return true;
    }

}

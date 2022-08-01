package test;

import problem.ValidParentheses;
import solution.ValidParenthesesStackImpl;
import utils.ResultUtils;

public class ValidParenthesesTest {

    public static void main(String[] args) {
        test(new ValidParenthesesStackImpl());
    }

    private static void test(ValidParentheses validParenthesesImpl) {
        boolean result;
        result = validParenthesesImpl.isValid("()");
        ResultUtils.printResult(result, true);

        result = validParenthesesImpl.isValid("()[]{}");
        ResultUtils.printResult(result, true);

        result = validParenthesesImpl.isValid("(]");
        ResultUtils.printResult(result, false);

        result = validParenthesesImpl.isValid("(");
        ResultUtils.printResult(result, false);

        result = validParenthesesImpl.isValid(")");
        ResultUtils.printResult(result, false);
    }

}

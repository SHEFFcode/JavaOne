package Brackets;

import java.util.Stack;

/**
 * Created by jeremy.shefer on 5/1/17.
 */
public class Brackets {
    public static boolean isCorrect(String bracketString) {
        char[] charArray = bracketString.toCharArray();
        int charLength = charArray.length;
        Stack<Character> stack = new Stack<>();


        if (charLength % 2 != 0) {
            return false;
        }
        for (char character:
             charArray) {
            if (character == '{') {
                stack.push(character);
            } else if (character == '}') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }
}

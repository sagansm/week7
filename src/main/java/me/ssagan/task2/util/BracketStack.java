package me.ssagan.task2.util;

import java.util.Stack;

public class BracketStack {
    public static boolean isCorrect(String seq) {
        boolean res;
        Stack<Character> stack = new Stack<>();
        stack.push(seq.charAt(0));

        for (int i = 1; i < seq.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(seq.charAt(i));
            } else {
                Character charInStack = stack.peek();
                if ((charInStack.equals('(') && (seq.charAt(i) == ')')) || (charInStack.equals('[') && (seq.charAt(i) == ']')) || (charInStack.equals('{') && (seq.charAt(i) == '}'))) {
                    stack.pop();
                } else stack.push(seq.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }
}

package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Stack<Character> stack = new Stack<>();
        if(s.length() == 0){
            return "unbalanced";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return "unbalanced";
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return "balanced";

        } else {
            return "unbalanced";
        }
    }
}

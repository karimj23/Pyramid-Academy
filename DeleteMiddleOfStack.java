package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (stack.size() == 0) {
            return stack;
        } else {
            if (stack.size() % 2 != 0) {
                stack.remove((stack.size() / 2));
                return stack;
            } else {
                stack.remove((stack.size() / 2) - 1);
                return stack;
            }
        }
    }
}
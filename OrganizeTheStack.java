package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> list = new ArrayList<>();

        if(stack.size() <= 1){
            return stack;
        }else {

            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            Collections.sort(list);
            Collections.reverse(list);

            // 	list.sort(Comparator.reverseOrder());
            stack.addAll(list);
            return stack;
        }
    }
}

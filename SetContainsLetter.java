package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashSet;

public class SetContainsLetter implements Assignment {
    public static Object solution(HashSet<Integer> nums, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(nums.contains(elm)){
            return elm;
        }
        return "?";
    }
}

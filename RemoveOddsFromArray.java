package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.Arrays;

public class RemoveOddsFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Arrays.stream(nums).filter(e -> e % 2 == 0).toArray();
    }
}

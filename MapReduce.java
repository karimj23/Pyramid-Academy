package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MapReduce implements Assignment {
    public int[] solution(ArrayList<ArrayList<Integer>> innerNums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return innerNums.stream().map(e -> e.stream().reduce(0, (n1, n2) -> n1 + n2)).mapToInt(Integer::intValue).toArray();
    }
}

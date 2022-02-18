package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class RetrieveValueFromGivenKey implements Assignment {
    public static int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(map.containsKey(value)) {
            return map.get(value);
        }
        return 0;
    }
}

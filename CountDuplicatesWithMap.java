package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        HashMap<Integer, Integer> occurances = new HashMap<>();

        for(int i = 0; i < nums.size(); i++){
            Integer integer = occurances.get(nums.get(i));
            if(integer == null){
                occurances.put(nums.get(i), 1);
            }else{
                occurances.put(nums.get(i), integer+1);
            }
        }
        return occurances;
    }
}

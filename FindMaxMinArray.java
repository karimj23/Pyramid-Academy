package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.*;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<Long> list = new ArrayList<Long>();
        List<Long> minmax = new ArrayList<>();
        if(nums.length == 0){
            int i = 0;
            long l = i;
            list.add(l);
            list.add(l);
            return (ArrayList<Long>) list;
        }else{
            for(int i = 0; i < nums.length; i++){
                list.add((long) nums[i]);
            }
            list.sort(null);
            minmax.add(list.get(list.size()-1));
            minmax.add(list.get(0));
        }
        return (ArrayList<Long>) minmax;
    }
}

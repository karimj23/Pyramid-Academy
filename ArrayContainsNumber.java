package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class ArrayContainsNumber implements Assignment {
    public boolean solution(int[] nums, int num) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for(int i = 0; i < nums.length;i++ ){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }
}

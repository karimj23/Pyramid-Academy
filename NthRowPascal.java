package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int prev = 1;
        if(nth == 0){
            return list;
        }else{
            for(int i = 1; i <= nth; i++ ) {
                // C = c * (line - i + 1) / i;
                int curr = (prev * (nth - i + 1)) / i;
                list.add(curr);
                prev = curr;
            }
        }
        return list;
    }
}

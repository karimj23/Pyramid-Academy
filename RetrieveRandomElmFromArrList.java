package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class RetrieveRandomElmFromArrList implements Assignment {
    public Integer solution(ArrayList<Integer> arrList, int elm) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(arrList.size()-1  < elm){
            return 0;
        }else if(arrList.size() -1 <= 0){
            return 0;
        }
        return arrList.get(elm);
    }
}

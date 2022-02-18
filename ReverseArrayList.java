package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        List<Integer> lst = new ArrayList<Integer>();
        if(list.size() <= 0 ){
            return list;
        }else {
            for (int i = list.size() -1 ; i >= 0 ; i--) {
                lst.add((Integer) list.get(i));
            }
        }
        return new ArrayList<Integer>(lst);
    }
}

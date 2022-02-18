package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class FindMissingInteger implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i < 101; i++){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            set.remove(numbers.get(i));
        }
        Iterator<Integer> iter = set.iterator();
        for(int i = 0; i < set.size(); i++){
            list.add(iter.next());
        }
        return list;
    }
}

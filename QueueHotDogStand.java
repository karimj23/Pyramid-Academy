package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.*;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if(list.size() < 3) {
            Collections.reverse(list);
            return list;
        }else if(list.size() == 3){
            return list;
        }else {
            ArrayList<Integer> lst = new ArrayList<>();
            for (int i = 3; i < list.size(); i++) {
                lst.add(list.get(i));
            }
            for (int i = 0; i < 3; i++) {
                lst.add(list.get(i));
            }
            return lst;
        }
    }
}

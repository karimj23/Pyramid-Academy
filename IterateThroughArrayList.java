package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;

public class IterateThroughArrayList implements Assignment {
    public static void solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}

package genspark.assignments.section5;

import genspark.assignments.Assignment;

import javassist.expr.NewArray;
import java.util.*;
import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String st = "";
        for(int i = 0; i < list.size(); i++){
            st += list.get(i);
        }
        int num = Integer.parseInt(st);
        num += 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(num>0){
            al.add(num % 10);
            num /= 10;
        }
        Collections.reverse(al);
        return new ArrayList<>();
    }
}

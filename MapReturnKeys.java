package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class MapReturnKeys implements Assignment {
    public static void solution(HashMap<String, Integer> map) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for (var k : map.keySet()) {
            System.out.println(k);
        }
    }
}
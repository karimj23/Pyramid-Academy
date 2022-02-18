package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.stream.Collectors
public class ReverseAStringReduce implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        return Stream.of(word.split("")).reduce("", (character1, character2) -> character2 + character1);
    }
}

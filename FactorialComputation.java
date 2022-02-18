package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int factorial = 1;
        if(n == 0){
            return 1;
        }else{
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}

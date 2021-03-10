package com.company.pa;

import java.util.ArrayList;
import java.util.List;

public class Permutation {


    public static int solution(int[] A) {
        List<Integer> incompleteArray = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            incompleteArray.add(A[i]);
        }

        for(int i = 1; i < A.length + 1; i++){
            if(!incompleteArray.contains(i)){
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        int [] A = {4, 1, 3, 2};

        System.out.println(solution(A));

    }

}




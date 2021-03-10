package com.company.pa;

import java.util.*;

public class SmallestPositiveInteger {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> incompleteList = new TreeSet<>();
        int result = 0;
        for(int i = 0; i < A.length; i++){
            incompleteList.add(A[i]);
        }

        System.out.println(incompleteList);


            for(int i = 1; i < A.length + 2; i++){
                if(!incompleteList.contains(i)){
                    result = i;
                    break;
                }
            }


        return result;
    }

    public static void main(String[] args) {
        int [] A = {-1, -3};
        System.out.println(solution(A));
    }


}

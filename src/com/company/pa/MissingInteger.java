package com.company.pa;

import java.util.*;

public class MissingInteger {


    public static int solution(int[] A) {
        int result = 0;
        int max = A.length + 1;

        List<Integer> incompleteList = new ArrayList<>();
        for(int i = 0; i<A.length; i++){
            incompleteList.add(A[i]);
        }


        for(int i = 1; i < max + 1; i++){
            if(!incompleteList.contains(i)){
                result = i;
            }
        }

        return result;
    }



    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(solution(A));



    }

}

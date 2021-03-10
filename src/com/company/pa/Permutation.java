package com.company.pa;

import java.util.Arrays;

public class Permutation {


    public static int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;

        for(int i : A){
            if(min == i){
                min++;
            }
        }

        if(min > A[A.length-1]){
            return 1;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        int [] A = {4, 1, 3};

        System.out.println(solution(A));

    }

}




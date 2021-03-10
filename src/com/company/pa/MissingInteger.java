package com.company.pa;

import java.util.*;

public class MissingInteger {


    public static int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;

        for(int i : A){
            if(i == min){
                min++;
            }
        }

        return min;
    }



    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println(solution(A));



    }

}

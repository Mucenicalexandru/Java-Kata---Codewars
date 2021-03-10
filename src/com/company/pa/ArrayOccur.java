package com.company.pa;

import java.util.Arrays;

public class ArrayOccur {

    public static int solution(int[] A) {
        int maxNumber = Arrays.stream(A).max().getAsInt();
        int minNumber = Arrays.stream(A).min().getAsInt();
        int result = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] != maxNumber && A[i] != minNumber){
                result = A[i];
            }
        }

        return result;


    }

    public static void main(String[] args) {
        int [] array = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution(array));

    }



}

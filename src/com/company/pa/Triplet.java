package com.company.pa;

import java.util.Arrays;

public class Triplet {

    //{-3, 1, 2, -2, 5, 6}
    //012 123 234 345
    public static int solution(int[] A) {
        Arrays.sort(A);
        int N = A.length;

        return Math.max(A[0]*A[1]*A[N-1], A[N-3]*A[N-2]*A[N-1]);


    }

    public static void main(String[] args) {
        String name = "Mucenic Alexandru";
        String [] parts = name.split("");

        System.out.println(Arrays.toString(parts));
    }


}

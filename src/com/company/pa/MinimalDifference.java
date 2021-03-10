package com.company.pa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MinimalDifference {

//    public int solution(int[] A) {
//        // write your code in Java SE 8
//    }

    public static void main(String[] args) {
        int [] A = {-3, 1, 2, 4, 3};

        List<Integer> differences = new ArrayList<>();

        int [] firstArray;
        int [] secondArray;

        for(int i = 1; i < A.length; i++){
            firstArray = new int[i];
            System.arraycopy(A, 0, firstArray, 0, i);

            secondArray = new int[A.length-(i)];
            System.arraycopy(A, i, secondArray, 0, A.length-(i));

            if((IntStream.of(secondArray).sum() - IntStream.of(firstArray).sum()) > 0 ){
                differences.add(IntStream.of(secondArray).sum() - IntStream.of(firstArray).sum());
            }else{
                differences.add(IntStream.of(firstArray).sum() - IntStream.of(secondArray).sum());
            }
        }

        Collections.sort(differences);
        System.out.println(differences.get(0));
    }


}

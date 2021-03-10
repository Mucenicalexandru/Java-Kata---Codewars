package com.company.pa;

import java.util.HashMap;
import java.util.Map;

public class ArrayRotation {

    public static int[] solution(int[] A, int K) {
       if(A.length == K){
           return A;
       }

       int [] result = new int[A.length];

       HashMap<Integer, Integer> hashMap = new HashMap<>();

       for(int i = 0; i < A.length; i++){
           if(i+K > A.length-1){
               hashMap.put(A[i], i+K - A.length);
           }else{
               hashMap.put(A[i], i+K);
           }
       }

       for(Map.Entry<Integer, Integer> entry : hashMap.entrySet() ){
           result[entry.getValue()] = entry.getKey();
       }

        return result;

    }

    public static void main(String[] args) {
        solution(new int[]{3, 8, 9, 7, 6}, 3);
    }

}

package com.company.pa;

import java.util.Arrays;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int [] firstHalf;
        int [] secondHalf;


        for(int i = 0; i < arr.length; i++){
            firstHalf = new int[i];
            System.arraycopy(arr, 0, firstHalf,0, i);
            secondHalf = new int[arr.length-i-1];
            System.arraycopy(arr, i+1, secondHalf, 0, arr.length-i-1);
            int firstSum;
            int secondSum;

            firstSum = Arrays.stream(firstHalf).sum();
            secondSum = Arrays.stream(secondHalf).sum();

            if(firstSum == secondSum){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4};
        System.out.println(findEvenIndex(arr));
    }

}

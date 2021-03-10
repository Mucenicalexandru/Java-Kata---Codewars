package com.company.pa;

import java.util.Arrays;

public class LargestGapInArray {



    public static int solution(int[] array){
        int maxNumber = Arrays.stream(array).max().getAsInt();
        int minNumber = Arrays.stream(array).min().getAsInt();
        return maxNumber-minNumber;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1, 6, 7, 0};
        System.out.println(solution(arr));
    }


}

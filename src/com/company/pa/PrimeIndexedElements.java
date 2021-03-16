package com.company.pa;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeIndexedElements {

    //A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller
    // natural numbers
    //a number is not divisible by more than its half
    public static int solve(int [] arr){
        int [] primeNumbers = new int[arr.length];
        for(int i = 2; i < arr.length; i++){
            if(isPrime(i)){
                primeNumbers[i] = arr[i];
            }
        }

        return IntStream.of(primeNumbers).sum();
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }


        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }


        return true;
    }


    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(solve(numbers));
    }

}

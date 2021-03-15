package com.company.pa;

public class Factor {

    public static int solution(int N) {
        // write your code in Java SE 8
        int counter = 0;
        for(int i = 1; i< N; i++){
            if(N % i == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println(solution(27043111));

    }
}

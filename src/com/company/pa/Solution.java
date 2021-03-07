package com.company.pa;

import java.util.*;

public class Solution {

        public String solution(String S, int[] A) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < S.length(); i++){

            }
            
            return result.toString();
        }


    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String S = "bytdag";
        int [] A = {4, 3, 0, 1, 2, 5};

        int counter = S.length();

        int currentPerson = 0;

        while (counter > 0){
            result.append(S.charAt(currentPerson));
            currentPerson = A[currentPerson];
            if(currentPerson == 0){
                break;
            }
            counter--;
        }

        System.out.println(result.toString());
    }
}

package com.company.pa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

    public static String FindIntersection(String[] strArr) {
        StringBuilder result = new StringBuilder();
        String [] arrayResult = new String[1];

        String [] firstList = strArr[0].split("");
        String [] secondList = strArr[1].split(",");

        for (String number: firstList
        ) {
            if(Arrays.asList(secondList).contains(number)){
                result.append(number).append(", ");
            }
        }

        result.deleteCharAt(result.lastIndexOf(","));
        result.deleteCharAt(result.lastIndexOf(" "));
        arrayResult[0] = result.toString();
        return arrayResult[0];
    }

    public static void main(String[] args) {
        
    }
}

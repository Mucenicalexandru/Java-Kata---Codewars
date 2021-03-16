package com.company.pa;

import java.lang.reflect.Array;
import java.util.*;

public class StringArrayDuplicates {

    public static String[] dup(String[] arr){
        String [] resultList = new String[arr.length];

        for(int j=0; j < arr.length; j++){
            Character firstChar = arr[j].charAt(0);


            String result = arr[j].substring(0, 1);

            for(int i = 1; i < arr[j].length(); i++){
                if(arr[j].charAt(i) != firstChar){
                    result = result +  arr[j].charAt(i);
                    firstChar = arr[j].charAt(i);
                }
            }
            resultList[j] = result;

        }

        return resultList;

    }

    public static void main(String[] args) {
        String [] duplicates = {"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"};
        System.out.println(Arrays.toString(dup(duplicates)));

    }
}

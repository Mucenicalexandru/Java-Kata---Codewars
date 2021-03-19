package com.company.pa;

import java.util.Arrays;

public class StringToCamelCase {

    static String toCamelCase(String s){
        String [] splitList = s.split("-|_");
        String result = "";
        for(int i = 0; i < splitList.length; i++){
            if(splitList[i].charAt(0)>96){
                i = 1;
                splitList[i] = String.valueOf(splitList[i].charAt(0)).toUpperCase() + splitList[i].substring(1);
                result += splitList[i];
            }

            splitList[i] = String.valueOf(splitList[i].charAt(0)).toUpperCase() + splitList[i].substring(1);
            result += splitList[i];
        }


        return result;
    }

    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        String input2 = "the-Stealth-Warriorss";

        String [] split = input2.split("_|-");
        System.out.println(Arrays.toString(split));

    }
}

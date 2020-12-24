package com.company.pa;


import java.util.ArrayList;
import java.util.List;

public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        StringBuilder temp = new StringBuilder();
        List<String> stringList = new ArrayList<>();


        if(k==0 || k > strarr.length){
            return "";
        }

        for (int i = 0; i < strarr.length-k+1; i++){
            for(int j=0; j < k; j++){
                temp.append(strarr[i+j]);
            }
            stringList.add(temp.toString());
            temp = new StringBuilder();
        }

        int largestString = stringList.get(0).length();
        int index = 0;

        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).length() > largestString){
                largestString = stringList.get(i).length();
                index = i;
            }
        }

        return stringList.get(index);
    }

    public static void main(String[] args) {



        String [] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;

        System.out.println(longestConsec(strarr, k));




    }

}

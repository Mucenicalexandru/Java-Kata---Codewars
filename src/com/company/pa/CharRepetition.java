package com.company.pa;

import java.util.*;

public class CharRepetition {

    public static Object[] longestRepetition(String s) {
        if(s.equals("")){
            return new Object[]{"", 0};
        }

        String [] chars = s.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            }else{
                map.put(chars[i], 1);
            }
        }

        Map.Entry<String, Integer> maxEntry = null;

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
                maxEntry = entry;
            }
        }


        return new Object[]{maxEntry.getKey(), maxEntry.getValue()};
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        String s = "aaaabb";
        System.out.println(longestRepetition(s).length);
    }


    }




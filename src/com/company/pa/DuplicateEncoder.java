package com.company.pa;

import java.util.HashMap;

public class DuplicateEncoder {

    static String encode(String word){
        word = word.toLowerCase();
        char [] chars = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character character : chars){
            map.merge(character, 1, Integer::sum);
        }
        String result = "";

        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i]) > 1){
                result += ")";
            }else{
                result += "(";
            }
        }


        return result;
    }

    public static void main(String[] args) {

    }

}

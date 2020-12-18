package com.company.pa;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeMap;

public class HelpTheBookseller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0){
            return "";
        }else {

            Hashtable<Character, Integer> hashtable = new Hashtable<>();
            List<Character> characterList = new ArrayList<>();
            List<Integer> integerList = new ArrayList<>();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < lstOfArt.length; i++) {
                characterList.add(lstOfArt[i].charAt(0));
                integerList.add(Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]+", "")));
            }

            for (int i = 0; i < characterList.size(); i++) {
                if (!hashtable.containsKey(lstOfArt[i].charAt(0))) {
                    hashtable.put(lstOfArt[i].charAt(0), Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]+", "")));
                } else {
                    hashtable.replace(lstOfArt[i].charAt(0), hashtable.get(lstOfArt[i].charAt(0)) + Integer.parseInt(lstOfArt[i].replaceAll("[^0-9]+", "")));
                }
            }

            TreeMap<Character, Integer> treeMap = new TreeMap<>(hashtable);

            for (int i = 0; i < lstOf1stLetter.length; i++) {
                if (treeMap.containsKey(lstOf1stLetter[i].charAt(0))) {
                    result.append("(").append(lstOf1stLetter[i]).append(" : ").append(treeMap.get(lstOf1stLetter[i].charAt(0))).append(") - ");
                } else {
                    result.append("(").append(lstOf1stLetter[i]).append(" : 0) - ");
                }
            }


            result.delete(result.length() - 3, result.length());
            return result.toString();
        }
    }


    public static void main(String[] args) {
        String [] lstOfArt = new String[] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String [] lstOf1stLetter = new String[] {"A", "B"};

        stockSummary(lstOfArt, lstOf1stLetter);

    }

}

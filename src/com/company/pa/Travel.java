package com.company.pa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Travel {
    public static String travel(String r, String zipcode) {
        return null;
    }

    public static String extractNumber(final String str) {

        if(str == null || str.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                sb.append(c);
                found = true;
            } else if(found){
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432";
        String zipcode = "OH 43071";
        String expectedResult = "NY 56432:High Street Pollocksville/786";
        String result = "";
        List<String> resultList = new ArrayList<>();
        String newString = "";

        String [] addressList = r.split(",");

        for(int i = 0; i < addressList.length; i++){
            if(addressList[i].contains(zipcode)){
                result = "";
                String number = extractNumber(addressList[i]);
                result += zipcode + ":" + addressList[i].replaceAll(zipcode, "/").replaceAll(number, "");
                result += number;
                if(resultList.size() > 0 && resultList.get(0).contains(zipcode)){
                    newString = resultList.get(0) + "," + number;
                }else{
                    resultList.add(result);
                }

            }
        }
        System.out.println(newString);
    }
}

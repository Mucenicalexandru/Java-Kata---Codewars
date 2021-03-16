package com.company.pa;

public class ExpandedForm {

    public static String expandedForm(int num)
    {
        int length = Integer.toString(num).length();
        String stringNumber = Integer.toString(num);
        String result = "";
        String finalResult = "";

        for(int i = 0; i < length; i++){
            if(stringNumber.charAt(i) != '0'){
                result = stringNumber.charAt(i) + "0".repeat(length-(i+1));
                finalResult += result + " + ";
            }
        }

        return finalResult.substring(0, finalResult.length() - 3);

    }

    public static void main(String[] args) {
        int number = 8055;
        System.out.println(expandedForm(number));
    }

    }


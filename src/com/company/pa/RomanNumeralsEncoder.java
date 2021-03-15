package com.company.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanNumeralsEncoder {


    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000
    // V 5000

    //MAX 3999

    //ex 1666

    public String solution(int n) {
        return "";
    }

    public static void main(String[] args) {

        int number = 842;

        String [] digit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String [] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String [] hundred = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String [] thousand = {"", "M", "MM", "MMM"};


        String result = thousand[number / 1000] +
                hundred[number % 1000 / 100] +
                ten[number % 100 / 10] +
                digit[number % 10];

        System.out.println(result);

    }

}

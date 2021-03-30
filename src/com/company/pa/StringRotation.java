package com.company.pa;

import java.util.*;

public class StringRotation {

    static int shiftedDiff(String first, String second) {
        String temp = "";
        if(first.equals(second)){
            return 0;
        }

        for (int i = 1; i < first.length(); i++) {
            temp = first.substring(first.length() - i) + first.substring(0, first.length() - i);
            if (temp.equals(second)) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        String first = "coffee";
        String second = "eecoff";

        System.out.println((second+second).indexOf(first));
    }

}



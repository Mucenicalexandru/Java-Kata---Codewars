package com.company.pa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhereIsMyParent {

    static String findChildren(final String text) {
        StringBuilder result = new StringBuilder();
        String [] strings = text.split("");
        Arrays.sort(strings);
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);

        for(int i = 0; i < strings.length; i++){
            result.append(strings[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "aAbaBb";
        System.out.println(findChildren(text));
    }

}

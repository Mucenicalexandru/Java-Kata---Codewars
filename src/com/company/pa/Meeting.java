package com.company.pa;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

public class Meeting {


    public static String meeting(String s){
        String [] names = s.split(";");

        for(int i = 0; i < names.length; i++){
            int semicolonIndex = names[i].indexOf(":");
            names[i] = "(" + names[i].substring(semicolonIndex + 1).toUpperCase() + ", " + names[i].substring(0, semicolonIndex).toUpperCase() + ")";
        }

        Arrays.sort(names);

        return String.join("", names);

    }

    public static void main(String[] args) {
        String s = "Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern";
        String s1 = "John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell";
        String s3 = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";

        System.out.println(meeting(s3));

    }


}

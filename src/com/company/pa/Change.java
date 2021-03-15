package com.company.pa;

import java.util.HashMap;

public class Change {

    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();

        if(cent <= 0){
            map.put("Pennies", 0);
            map.put("Nickels", 0);
            map.put("Dimes", 0);
            map.put("Quarters", 0);
            return map;
        }

        int quarters = cent / 25;
        int dimes = cent % 25 / 10;
        int nickels = cent % 25 % 10 / 5;
        int pennies = cent % 5;

        map.put("Pennies", pennies);
        map.put("Nickels", nickels);
        map.put("Dimes", dimes);
        map.put("Quarters", quarters);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(looseChange(0));
    }

}

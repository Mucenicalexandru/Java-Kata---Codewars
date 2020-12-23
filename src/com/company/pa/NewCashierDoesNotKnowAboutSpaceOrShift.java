package com.company.pa;

import java.util.*;

public class NewCashierDoesNotKnowAboutSpaceOrShift {

        public static String getOrder(String input) {
            StringBuilder returnResult = new StringBuilder();
            Map<String, String> menu = new HashMap<>();
            menu.put("1", "Burger");
            menu.put("2", "Fries");
            menu.put("3", "Chicken");
            menu.put("4", "Pizza");
            menu.put("5", "Sandwich");
            menu.put("6", "Onionrings");
            menu.put("7", "Milkshake");
            menu.put("8", "Coke");

            String [] result = input.replace("burger", "1" )
                    .replace("fries", "2")
                    .replace("chicken", "3")
                    .replace("pizza", "4")
                    .replace("sandwich", "5")
                    .replace("onionrings", "6")
                    .replace("milkshake", "7")
                    .replace("coke", "8")
                    .split("");

            Arrays.sort(result);

            for(int i = 0; i< result.length; i++){
                returnResult.append(menu.get(result[i])).append(" ");
            }

            returnResult.deleteCharAt(returnResult.length()-1);


            return returnResult.toString();
        }


    public static void main(String[] args) {
          String order = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";

          System.out.println(getOrder(order));
    }


}

package com.company.pa;

import java.util.HashMap;

public class DateByDayNumber {

    public static String getDay(int day, boolean isLeap) {
        String result = "";
        String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int [] leap =    {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        int [] nonLeap = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

        if (day <= 31) {
            result = "January, " + day;
        }else{
            if(isLeap){
                for(int i = 0; i < leap.length; i++){
                    if(day <= leap[i]){
                        result = months[i] + ", " + (day - leap[i-1]);
                        break;
                    }
                }
            }else{
                for(int i = 0; i < nonLeap.length; i++){
                    if(day <= nonLeap[i]){
                        result = months[i] + ", " + (day - nonLeap[i-1]);
                        break;
                    }
                }
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getDay(365, false));
    }


}

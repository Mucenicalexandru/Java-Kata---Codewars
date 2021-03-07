package com.company.pa;


import java.util.stream.IntStream;

public class Coderbyte {



    public static void main(String[] args) {

//        String number = "2466";
//
//        StringBuilder result= new StringBuilder(); // 1 + 2
//
//        char firstChar= number.charAt(0); // 4
//
//        number = number.substring(1) + " "; // "66  "
//        int howManyTimesRepeated = 1;
//
//        for(char actualChar: number.toCharArray()){
//            if(actualChar != firstChar){
//                result.append(howManyTimesRepeated).append(firstChar);
//                howManyTimesRepeated= 1;
//                firstChar = actualChar;
//            }else{
//                howManyTimesRepeated+= 1;
//            }
//        }

        int [] numbers = {16, 22, 35, 8, 20, 1, 22, 11};
        int totalSum = IntStream.of(numbers).sum();

        System.out.println(totalSum % 2);

    }

}

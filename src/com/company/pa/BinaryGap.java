package com.company.pa;

public class BinaryGap {

    public static int solution(int N) {
        StringBuilder string = new StringBuilder(Integer.toBinaryString(N));
        int result = 0;
        int longest = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '0'){
                result++;
            }else{
                if(longest <= result){
                    longest = result;
                    result = 0;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(74901729));
        System.out.println(solution(74901729));
    }


}

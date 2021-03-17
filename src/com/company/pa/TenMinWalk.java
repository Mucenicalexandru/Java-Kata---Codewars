package com.company.pa;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if(walk.length != 10){
            return false;
        }

        int n = 0;
        int s = 0;
        int w = 0;
        int e = 0;

        for(Character character : walk){
            if(character == 'n'){
                n++;
            }else if(character == 's'){
                s++;
            }else if(character == 'e'){
                e++;
            }else if(character == 'w'){
                w++;
            }
        }

        if(n == s && w == e){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }

}

package com.company.pa;

public class FrogJump {

    public static int solution(int X, int Y, int D) {
        if(X == Y){
            return 0;
        }

        if((Y - X) % D == 0){
            return (Y - X) / D;
        }else{
            return (Y - X) / D + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(7/2);
        System.out.println(7%2);
    }
}

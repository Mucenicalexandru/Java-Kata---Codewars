package com.company.pa;

import java.util.HashSet;
import java.util.Set;

public class DistinctElements {

    //O(n)
    public int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> distinctList = new HashSet<>();

        for(int i : A){
            distinctList.add(i);
        }

        return distinctList.size();
    }
}

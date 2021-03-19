package com.company.pa;

import java.util.List;

public class Quicksort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort) {

    }

    public static void quickSort(int[] toSort, int startIndex, int endIndex){
        if(endIndex - startIndex < 2){
            return;
        }

        int pivotIndex = partition(toSort, startIndex, endIndex);
        quickSort(toSort, startIndex, pivotIndex);
        quickSort(toSort, pivotIndex + 1, endIndex);
    }


    public static int partition(int[] input, int start, int end){
        //This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){
            //Empty loop
            while (i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            //Empty loop
            while (i < j && input[++i] <= pivot);
            if(i < j){
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }

    public static void main(String[] args) {
        int[] arrayToSort = {55, 7, -12, 71, 1, -22, 30, 27, -5};
        quickSort(arrayToSort, 0, arrayToSort.length);

        for(int i = 0; i < arrayToSort.length; i++){
            System.out.println(arrayToSort[i]);
        }
    }

}

package com.company;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        int[] arrayToSort = {5, 6, 4, 1, 6, 7, 3, 8,9,10};
        BubbleSorter sorter = new BubbleSorter ();
        int[] sortedArray = sorter.sortArray (arrayToSort);
        System.out.println (Arrays.toString (sortedArray));
    }

}



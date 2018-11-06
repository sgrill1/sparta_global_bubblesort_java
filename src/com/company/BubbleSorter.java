package com.company;

public class BubbleSorter implements Sorter{ //Bubble Sorter inherits from Sorter
    public int[] sortArray(int[] arrayToSort) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int swaps = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = swaps;
                    swapped = true;
                }
            }
        } while (swapped);
        return arrayToSort;
    }

    @Override
    public String toString() {
        return "Bubble Sorter";
    }

    @Override
    public void reverseSorter() {

    }
}


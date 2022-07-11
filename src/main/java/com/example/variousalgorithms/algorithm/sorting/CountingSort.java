package com.example.variousalgorithms.algorithm.sorting;

import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>CountingSort</h1>
 * Counting sort is a sorting technique based on keys between a specific range.
 * It works by counting the number of objects having distinct key values (kind
 * of hashing). Then do some arithmetic to calculate the position of each
 * object in the output sequence.
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i++) {
            PrintService.printMessage(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}

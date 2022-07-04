package com.example.variousalgorithms.algorithm.sorting;

import com.example.variousalgorithms.algorithm.sorting.utils.SortUtils;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>SelectionSort</h1>
 * The selection sort algorithm sorts an array by repeatedly finding the
 * minimum or maximum element (considering ascending order) from unsorted
 * part and putting it at the beginning. The algorithm maintains two subarrays
 * in a given array.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            SortUtils.swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            PrintService.printMessage(intArray[i]);
        }
    }
}

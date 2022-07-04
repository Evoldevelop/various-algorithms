package com.example.variousalgorithms.algorithm.sorting;

/**
 * Bubble sort is most simple simple sorting algorithm and compares adjacent
 * elements of an array and swaps them if the element on the right is smaller
 * than the one on the left.
 *
 * It is an in-place sorting algorithm i.e. no extra space is needed for this
 * sort, the array itself is modified.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

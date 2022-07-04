package com.example.variousalgorithms.algorithm.sorting.utils;

/**
 * <h1>SortUtils</h1>
 * Utils class for sorting functionalities.
 */
public class SortUtils {

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

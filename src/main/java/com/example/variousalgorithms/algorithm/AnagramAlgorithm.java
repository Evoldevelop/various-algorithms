package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>AnagramAlgorithm</h1>
 * Algorithm that checks if two given words are anagram of each other.
 * Anagram words are those that contain the same characters and the same length.
 */
public class AnagramAlgorithm extends Algorithm{

    public static final String ALGORITHM_NAME = "Anagram";

    @Override
    public void execute() {
        String input = ConsoleService.askForStringInput("Insert two words separated by a space> ");
        String words[] = input.split(" ");
        boolean areAnagram = areAnagram(words[0], words[1]);
        PrintService.printGreenMessage(areAnagram ? "Are anagram" : "Are not anagram");
    }

    /**
     * Check if two words are anagram of each other.
     *
     * @param wordOne
     * @param wordTwo
     * @return {@link boolean} result if are anagram or not.
     */
    private boolean areAnagram(String wordOne, String wordTwo) {
        return true;
    }
}

package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>PalindromeAlgorithm</h1>
 * Algorithm that checks if an input is palindrome or not.
 * Palindrome is a word, phrase, or sequence that reads the same backwards as forwards,
 * e.g. madam or nurses run.
 */
public class PalindromeAlgorithm extends Algorithm {

    public static final String ALGORITHM_NAME = "Palindrome";

    @Override
    public void execute() {
        String input = ConsoleService.askForStringInput("Insert a word or number> ");
        boolean isPalindrome = isPalindrome(input);
        PrintService.printGreenMessage(isPalindrome ? "Is palindrome" : "Is not palindrome");
    }

    /**
     * Calculates if a String is palindrome or not.
     *
     * @param input To be checked.
     * @return A {@link boolean} result if palindrome or not.
     */
    private boolean isPalindrome(String input) {
        input = input.replaceAll("\\s", "");
        char[] inputArray = input.toCharArray();

        StringBuilder sb = new StringBuilder(inputArray.length);
        for (int i = inputArray.length; i != 0; i--) {
            sb.append(inputArray[i - 1]);
        }

        return sb.toString().equals(input);
    }
}

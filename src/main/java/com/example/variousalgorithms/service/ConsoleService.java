package com.example.variousalgorithms.service;

import java.util.Scanner;

/**
 * <h1>ConsoleService</h1>
 * Service for console related functionality.
 */
public class ConsoleService {

    /**
     * Asks for an integer input by console.
     *
     * @param messageRequest Message to be shown for the input request.
     * @return The input.
     */
    public static Integer askForIntegerInput(String messageRequest) {
        Scanner keyboard = new Scanner(System.in);

        PrintService.printGreenMessage(messageRequest);
        final String line = keyboard.nextLine();

        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

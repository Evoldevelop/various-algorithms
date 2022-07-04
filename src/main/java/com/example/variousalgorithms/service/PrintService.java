package com.example.variousalgorithms.service;

/**
 * <h1>PrintService</h1>
 * Service that prints messages.
 * Decouples System from the business logic.
 */
public class PrintService {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Prints a {@link String} in console.
     *
     * @param message Message to be printed.
     */
    public static void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prints an {@link int} in console.
     *
     * @param x int to be printed.
     */
    public static void printMessage(int x) {
        System.out.println(x);
    }

    /**
     * Prints a purple {@link String} in console.
     *
     * @param message Message to be printed in purple.
     */
    public static void printPurpleMessage(String message) {
        printMessage(getFormattedMessage("%s %s %s", ANSI_PURPLE, message, ANSI_RESET));
    }

    /**
     * Prints a red {@link String} in console.
     *
     * @param message Message to be printed in red.
     */
    public static void printRedMessage(String message) {
        printMessage(getFormattedMessage("%s %s %s", ANSI_RED, message, ANSI_RESET));
    }

    /**
     * Prints a green {@link String} in console.
     *
     * @param message Message to be printed in green.
     */
    public static void printGreenMessage(String message) {
        printMessage(getFormattedMessage("%s %s %s", ANSI_GREEN, message, ANSI_RESET));
    }

    /**
     * Prints a formatted {@link String} in console.
     *
     * @param format Format chosen for the message.
     * @param args   Arguments referenced by the format specifier.
     */
    public static void printFormattedMessage(String format, Object... args) {
        printMessage(getFormattedMessage(format, args));
    }

    /**
     * Prints a purple formatted {@link String} in console.
     *
     * @param format Format chosen for the message.
     * @param args   Arguments referenced by the format specifier.
     */
    public static void printPurpleFormattedMessage(String format, Object... args) {
        printPurpleMessage(getFormattedMessage(format, args));
    }

    /**
     * Prints a red formatted {@link String} in console.
     *
     * @param format Format chosen for the message.
     * @param args   Arguments referenced by the format specifier.
     */
    public static void printRedFormattedMessage(String format, Object... args) {
        printRedMessage(getFormattedMessage(format, args));
    }

    /**
     * Returns a formatted {@link String}.
     *
     * @param format Format chosen for the message.
     * @param args   Arguments referenced by the format specifier.
     */
    public static String getFormattedMessage(String format, Object... args) {
        return String.format(format, args);
    }
}

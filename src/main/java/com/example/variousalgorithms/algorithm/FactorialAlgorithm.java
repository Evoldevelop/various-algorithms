package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>FactorialAlgorithm</h1>
 * Algorithm that calculates the factorial of a given number.
 * The factorial of a number is the result of multiply all the numbers
 * between the given number and 1.
 */
public class FactorialAlgorithm extends Algorithm {

    public static final String ALGORITHM_NAME = "Factorial";

    @Override
    public void execute() {
        int number = ConsoleService.askForIntegerInput("Insert a number> ");
        PrintService.printFormattedMessage("%d", calculateFactorial(number));
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param number To be calculated.
     * @return The factorial of the given number.
     */
    private int calculateFactorial(Integer number) {
        int factorial = 1;
        for (int i = number.intValue(); i > 0; i--) {
            factorial *= i;
        }

        return factorial;
    }
}


package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>PrimeNumberAlgorithm</h1>
 * Algorithm that calculates if a number is prime or not.
 * A Prime number a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
 */
public class PrimeNumberAlgorithm extends Algorithm {

    public static final String ALGORITHM_NAME = "Prime Number";

    @Override
    public void execute() {
        int number = ConsoleService.askForIntegerInput("Insert a number> ");
        boolean isPrime = isPrimerNumber(number);
        PrintService.printGreenMessage(isPrime ? "Is prime" : "Is not prime");
    }

    /**
     * Calculates if a number is prime or not.
     *
     * @param number To be calculated.
     * @return A {@link boolean} result if prime or not.
     */
    private boolean isPrimerNumber(int number) {
        if (number <= 1) return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}

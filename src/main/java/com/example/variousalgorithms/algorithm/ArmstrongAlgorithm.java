package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

/**
 * <h1>ArmstrongAlgorithm</h1>
 * Algorithm that calculates if a number is an Armstrong number or not.
 * Armstrong number is a number that is equal to the sum of cubes of its digits (153).
 */
public class ArmstrongAlgorithm extends Algorithm {

    public static final String ALGORITHM_NAME = "Armstrong Number";

    @Override
    public void execute() {
        int number = ConsoleService.askForIntegerInput("Insert a number> ");
        boolean isArmstrong = isArmstrongNumber(number);
        PrintService.printGreenMessage(isArmstrong ? "Is an Armstrong number" : "Is not an Armstrong number");
    }

    /**
     * Calculates if a number is Armstrong or not.
     *
     * @param number To be calculated.
     * @return A {@link boolean} result if Armstrong or not.
     */
    private boolean isArmstrongNumber(Integer number) {
        char numberArray[] = number.toString().toCharArray();

        int calculatedNumber = 0;
        for (int i = 0; i < numberArray.length; i++) {
            int digit = Character.getNumericValue(numberArray[i]);
            calculatedNumber += Math.pow(digit, 3);
        }

        return number == calculatedNumber;
    }
}


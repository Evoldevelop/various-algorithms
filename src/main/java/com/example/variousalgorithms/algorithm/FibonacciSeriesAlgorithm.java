package com.example.variousalgorithms.algorithm;

import com.example.variousalgorithms.service.ConsoleService;
import com.example.variousalgorithms.service.PrintService;

import java.util.LinkedList;
import java.util.List;

/**
 * <h1>FibonacciSeries</h1>
 * Algorithm that print Fibonacci series up to a given number.
 * Fibonacci series are series of numbers in which each number ( Fibonacci number )
 * is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc
 */
public class FibonacciSeriesAlgorithm extends Algorithm {

    public static final String ALGORITHM_NAME = "Fibonacci Series";

    @Override
    public void execute() {
        int stopper = ConsoleService.askForIntegerInput("Insert sequence limit> ");
        List<Integer> fibonacciSerie = calculateSerie(stopper);
        PrintService.printMessage(fibonacciSerie.toString());
    }

    /**
     * Calculates the fibonacci series given a stopper number.
     *
     * @param stopper Stopper to stop the calculation.
     * @return The {@link List} with the Fibonacci series.
     */
    private List<Integer> calculateSerie(int stopper) {
        List<Integer> fibonacciSerie = new LinkedList<>(List.of(0, 1));

        int newValue, counter = 0;
        while (counter + 1 < stopper) {
            newValue = fibonacciSerie.get(counter) + fibonacciSerie.get(++counter);
            fibonacciSerie.add(newValue);
        }

        return fibonacciSerie;
    }
}

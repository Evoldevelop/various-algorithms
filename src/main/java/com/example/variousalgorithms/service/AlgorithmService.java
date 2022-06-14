package com.example.variousalgorithms.service;

import com.example.variousalgorithms.algorithm.Algorithm;
import com.example.variousalgorithms.algorithm.FibonacciSeriesAlgorithm;
import com.example.variousalgorithms.algorithm.PrimeNumberAlgorithm;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>AlgorithmService</h1>
 * Service used for the algorithm management.
 */
public class AlgorithmService {

    private static final Class<FibonacciSeriesAlgorithm> FIBONACCI_SERIES_ALGORITHM = FibonacciSeriesAlgorithm.class;
    private static final Class<PrimeNumberAlgorithm> PRIME_NUMBER_ALGORITHM = PrimeNumberAlgorithm.class;

    /**
     * Gets all the available algorithms.
     *
     * @return A {@link List} containing all the algorithms.
     */
    public static List<Class<? extends Algorithm>> getAllAlgorithms() {
        return Arrays.stream(AlgorithmService.class.getDeclaredFields()).map(f -> {
            try {
                return (Class<Algorithm>) f.get(f);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            return null;
        }).collect(Collectors.toList());
    }
}

package com.example.variousalgorithms;

import com.example.variousalgorithms.algorithm.Algorithm;
import com.example.variousalgorithms.constant.ErrorValue;
import com.example.variousalgorithms.service.AlgorithmService;
import com.example.variousalgorithms.service.PrintService;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class VariousAlgorithmsApplication {

    public static void main(String[] args) {

        List<Class<? extends Algorithm>> availableAlgorithms = AlgorithmService.getAllAlgorithms();

        Scanner keyboard = new Scanner(System.in);
        while (true) {
            printMenu(availableAlgorithms);
            final String line = keyboard.nextLine();

            if(line.equals("quit")) System.exit(0);

            Integer algorithmNumber = getChosenAlgorithmNumber(line, availableAlgorithms);
            if (algorithmNumber == 0) {
                PrintService.printRedMessage(ErrorValue.INVALID_INPUT);
            } else {
                Class<? extends Algorithm> algorithm = availableAlgorithms.get(--algorithmNumber);
                executeAlgorithm(algorithm);
            }
        }
    }

    private static void printMenu(List<Class<? extends Algorithm>> availableAlgorithms) {
        PrintService.printPurpleMessage("Choose an algorithm to play:");
        PrintService.printPurpleMessage("-----------------------------");

        IntStream.range(0, availableAlgorithms.size())
                .forEach(idx -> {
                    try {
                        Class<? extends Algorithm> algorithm = availableAlgorithms.get(idx);
                        Object algorithmInstance = algorithm.getDeclaredConstructor().newInstance();
                        PrintService.printPurpleFormattedMessage("%d. %s", idx + 1,
                                algorithm.getDeclaredField("ALGORITHM_NAME").get(algorithmInstance));
                    } catch (Exception e) {
                        PrintService.printRedFormattedMessage(ErrorValue.ERROR_OCCURRED, e.getStackTrace());
                        e.printStackTrace();
                    }
                });
    }

    private static Integer getChosenAlgorithmNumber(String line, List<Class<? extends Algorithm>> availableAlgorithms) {
        int algorithmNumber;
        try {
            algorithmNumber = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }

        if (algorithmNumber <= 0 || algorithmNumber > availableAlgorithms.size()) return 0;

        return algorithmNumber;
    }

    private static String executeAlgorithm(Class<? extends Algorithm> algorithm) {
        try {
            Method method = algorithm.getDeclaredMethod("execute");
            return (String) method.invoke(algorithm.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            PrintService.printRedFormattedMessage(ErrorValue.ERROR_OCCURRED, e.getStackTrace());
            e.printStackTrace();
        }
        return null;
    }
}

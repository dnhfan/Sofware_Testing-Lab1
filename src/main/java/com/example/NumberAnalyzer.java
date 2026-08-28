package com.example;

public class NumberAnalyzer {

    public static int analyze(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            if (number > 0) {
                result += number;
            } else {
                result -= number;
            }
        }

        return result;
    }
}

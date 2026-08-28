package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NumberAnalyzerTest {

    @Test
    void shouldHandlePositiveNumbers() {
        int[] numbers = {1, 2, 3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(6, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] numbers = {-1, -2, -3};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(6, result);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] numbers = {};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleMixedNumbers() {
        int[] numbers = {5, -2};

        int result = NumberAnalyzer.analyze(numbers);

        assertEquals(7, result);
    }
}

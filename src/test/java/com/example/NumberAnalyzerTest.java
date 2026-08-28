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
}

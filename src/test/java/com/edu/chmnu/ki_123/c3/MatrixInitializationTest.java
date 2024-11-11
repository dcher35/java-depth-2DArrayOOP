package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixInitializationTest {

    private MatrixInitialization matrixInitialization;

    //Створюємо початкову матрицю для тестів
    @BeforeEach
    void setUp() {
        double[][] matrix = {
                {9.2, 2.5, 12.9},
                {4.4, 11.1, 6.0},
                {10.9, 8.1, 1.9},
                {5.2, 7.9, 3.0}
        };
        matrixInitialization = new MatrixInitialization(matrix);
    }

    //Тест для перевірки транспонування матриці.
    @Test
    void testTransposeMatrix() {
        double[][] expectedTransposedMatrix = {
                {9.2, 4.4, 10.9, 5.2},
                {2.5, 11.1, 8.1, 7.9},
                {12.9, 6.0, 1.9, 3.0}
        };

        double[][] transposedMatrix = matrixInitialization.transposeMatrix();

        assertArrayEquals(expectedTransposedMatrix, transposedMatrix, "The transposed matrix does not match the expected one");
    }

    //Тест для перевірки правильності збереження результату транспонування у класі Record.
    @Test
    void testResultAfterTranspose() {
        matrixInitialization.transposeMatrix();

        String result = matrixInitialization.getResult().getResult();

        String expectedResult = "[9.2, 4.4, 10.9, 5.2]\n[2.5, 11.1, 8.1, 7.9]\n[12.9, 6.0, 1.9, 3.0]\n";

        assertEquals(expectedResult, result);
    }

    //Тест для перевірки транспонування порожньої матриці.
    @Test
    void testEmptyMatrix() {
        double[][] emptyMatrix = {};

        matrixInitialization = new MatrixInitialization(emptyMatrix);

        double[][] transposedMatrix = matrixInitialization.transposeMatrix();

        double[][] expectedEmptyMatrix = {};
        assertArrayEquals(expectedEmptyMatrix, transposedMatrix, "A transposed empty matrix is not empty");
    }

    //Тест для перевірки транспонування матриці 1x1.
    @Test
    void testOneElementMatrix() {
        double[][] oneElementMatrix = {
                {7.2}
        };

        matrixInitialization = new MatrixInitialization(oneElementMatrix);

        double[][] expectedTransposedMatrix = {
                {7.2}
        };

        double[][] transposedMatrix = matrixInitialization.transposeMatrix();

        assertArrayEquals(expectedTransposedMatrix, transposedMatrix, "The transposed 1x1 matrix does not match the expected one");
    }
}
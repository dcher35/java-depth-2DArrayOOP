package com.edu.chmnu.ki_123.c3;

public class ArrayResult {

    public static void main(String[] args) {
        double[][] matrix = {
                {9.2, 2.5, 12.9},
                {4.4, 11.1, 6.0},
                {10.9, 8.1, 1.9},
                {5.2, 7.9, 3.0}
        };

        MatrixInitialization matrixInitialization = new MatrixInitialization(matrix);

        System.out.println("Original matrix:");
        System.out.println(matrixInitialization.getResult());

        double[][] transposedMatrix = matrixInitialization.transposeMatrix();

        System.out.println("Transposed matrix:");
        System.out.println(matrixInitialization.getResult());
    }
}
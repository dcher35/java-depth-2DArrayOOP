package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class MatrixInitialization {

    private double[][] matrix;
    private Record result;

    public MatrixInitialization(double[][] matrix) {
        this.matrix = matrix;
        this.result = new Record(matrixToString(matrix));
    }

    public double[][] transposeMatrix() {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new double[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        result.setResult(matrixToString(transposedMatrix));
        return transposedMatrix;
    }

    public String matrixToString(double[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

    public Record getResult() {
        return result;
    }
}
package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        int[][] matrix = new int[n][m];

        fillMatrix(matrix, n, m, scanner);

        int bestSum = Integer.MIN_VALUE;
        int[] bestCordinate = new int[2];

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[] start = new int[]{row, col};
                if(findSum(start, matrix) > bestSum){
                    bestSum = findSum(start, matrix);
                    bestCordinate = start;
                }
            }
        }

        System.out.println(String.format("Sum = %d", bestSum));
        printMatrix(matrix, bestCordinate);


    }

    private static int findSum(int[] bestCordinate, int[][] matrix) {
        int sum = 0;
        for (int row = bestCordinate[0]; row < bestCordinate[0] + 3; row++) {
            for (int col = bestCordinate[1]; col < bestCordinate[1] + 3; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, int n, int m, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = values[j];
            }
        }
    }

    private static void printMatrix(int[][] matrix, int[] bestCordinate) {
        for (int row = bestCordinate[0]; row < bestCordinate[0] + 3; row++) {
            for (int col = bestCordinate[1]; col < bestCordinate[1] + 3; col++) {
                System.out.print(String.format("%d ", matrix[row][col]));
            }
            System.out.println();
        }
    }

}

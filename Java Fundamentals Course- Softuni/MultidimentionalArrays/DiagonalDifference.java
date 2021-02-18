package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        fillMatrix(matrix, n, scanner);

        calculateDiagonalDifference(matrix, n);

    }

    private static void calculateDiagonalDifference(int[][] matrix, int n) {
        int num1 = 0;
        int num2 = 0;
        int index = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; index < n; j++) {
               num1  += matrix[index][j];
               index++;
            }
        }
        for (int i = 0; i < 1; i++) {
            index = n-1;
            for (int j = 0; index >= 0; j++) {
                num2  += matrix[j][index];
                index--;
            }
        }

        System.out.println(Math.abs(num1 - num2));
    }

    private static void fillMatrix(int[][] matrix, int n, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            int[] values = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = values[j];
            }
        }
    }
}

package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int m = input[1];

        String[][] matrix = new String[n][m];
        fillMatrix(matrix, n, m, scanner);
        String commands = "";

        while (!"END".equals(commands = scanner.nextLine())) {
            String[] tokens = commands.split("\\s+");
            if (tokens[0].equals("swap") && tokens.length == 5) {
                int roll1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int roll2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);
                swap(roll1, col1, roll2, col2, matrix);
            } else {
                System.out.println("Invalid input!");
            }
        }
    }

    private static void swap(int roll1, int col1, int roll2, int col2, String[][] matrix) {
        if (isValid(roll1, col1, matrix) && isValid(roll2, col2, matrix)) {
            String temp = matrix[roll1][col1];
            matrix[roll1][col1] = matrix[roll2][col2];
            matrix[roll2][col2] = temp;
            printMatrix(matrix);
        } else {
            System.out.println("Invalid input!");
        }
    }

    private static boolean isValid(int roll, int col, String[][] matrix) {
        if (roll >= 0 && roll < matrix.length && col >= 0 && col < matrix[roll].length) {
            return true;
        }
        return false;
    }


    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(String.format("%s ", element));
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, int n, int m, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            String[] values = scanner.nextLine().split("\\s+");
            matrix[i] = values;
        }
    }
}

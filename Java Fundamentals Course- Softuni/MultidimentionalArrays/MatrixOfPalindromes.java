package MultidimentionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int c = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);

        String[][] matrix = new String[c][r];
        fillMatrix(matrix, r, c);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {

        for(String[] row : matrix){
            String res = "";
            for (String s : row) {
                res += String.format(s + " ");
            }
            System.out.println(res.trim());
        }
    }

    private static void fillMatrix(String[][] matrix, int r, int c) {
        String palindrome = "";
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                char borderChar = (char) ('a' + i);
                char middleChar = (char) (borderChar + j);
                palindrome = String.format("%c%c%c",borderChar, middleChar, borderChar);
                matrix[i][j] = palindrome;
            }
        }
    }
}

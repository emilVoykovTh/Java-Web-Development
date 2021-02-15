package MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nXm = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(x ->Integer.parseInt(x)).toArray();

        int[][] matrix = new int[nXm[0]][nXm[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int bestSum = Integer.MIN_VALUE;
        int[] bestVector = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int[] start = new int[]{row,col};


            }

        }

    }
}

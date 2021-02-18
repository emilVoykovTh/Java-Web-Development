package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calcFactorial(firstInt);
        long secondFactorial = calcFactorial(secondInt);
        double result = firstFactorial * 1.0 / secondFactorial;
        System.out.printf("%.2f", result);
    }

    private static long calcFactorial(int n) {
        long result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}


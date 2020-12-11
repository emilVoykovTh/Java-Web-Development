package Methods;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printSign(n);
    }

    private static void printSign(int n) {
        if (n > 0) {
            System.out.println( "The number " + n  + " is positive.");
        } if (n < 0) {
            System.out.println("The number " + n + " is negative.");
        } if (n == 0){
            System.out.println("The number 0 is zero.");
        }
    }
}

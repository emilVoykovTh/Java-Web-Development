package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
       int num = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).min().getAsInt();
        System.out.println(num);
    }
}

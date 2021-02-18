package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(num -> num += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(num -> num * 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(num -> num -= 1).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(value -> System.out.print(value + " "));

        String input = "";

        while (!"end".equals(input = scanner.nextLine())){
            switch (input){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

        }


    }
}

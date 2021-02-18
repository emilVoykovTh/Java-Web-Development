package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }

            String[] commandParts = input.split(" ");

            switch (commandParts[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commandParts[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandParts[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0 && i != numbers.size() - 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                            if (numbers.get(i) % 2 == 0 && i == numbers.size() - 1) {
                                System.out.print(numbers.get(i));
                            }
                        }
                        System.out.println();
                    }
                    if (commandParts[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0 && i != numbers.size() - 1) {
                                System.out.print(numbers.get(i) + " ");
                            }
                            if (numbers.get(i) % 2 != 0 && i == numbers.size() - 1) {
                                System.out.print(numbers.get(i));
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    printSumOfNumbers(numbers);
                    break;
                case "Filter":
                    filterList(commandParts[1], Integer.parseInt(commandParts[2]), numbers);
                    break;

            }
        }

    }

    private static void filterList(String condition, int num, List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            switch (condition) {
                case "<":
                    if (numbers.get(i) < num && i != numbers.size() - 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                    if (numbers.get(i) < num && i == numbers.size() - 1) {
                        System.out.print(numbers.get(i));
                    }
                        break;
                case ">":
                    if (numbers.get(i) > num && i != numbers.size() - 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                    if (numbers.get(i) > num && i == numbers.size() - 1) {
                        System.out.print(numbers.get(i));
                    }
                    break;
                case "<=":
                    if (numbers.get(i) <= num && i != numbers.size() - 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                    if (numbers.get(i) <= num && i == numbers.size() - 1) {
                        System.out.print(numbers.get(i));
                    }
                    break;
                case ">=":
                    if (numbers.get(i) >= num && i != numbers.size() - 1) {
                        System.out.print(numbers.get(i) + " ");
                    }
                    if (numbers.get(i) >= num && i == numbers.size() - 1) {
                        System.out.print(numbers.get(i));
                    }
                    break;
            }

        }
        System.out.println();
    }

    private static void printSumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}

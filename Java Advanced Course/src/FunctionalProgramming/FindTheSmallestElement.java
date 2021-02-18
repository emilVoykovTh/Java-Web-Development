package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> lastIndexOfSmallestNum = list -> list.lastIndexOf(list.stream().min(Integer::compare).get());

        System.out.println(lastIndexOfSmallestNum.apply(numbers));
    }
}

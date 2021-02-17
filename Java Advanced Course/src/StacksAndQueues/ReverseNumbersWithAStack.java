package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(value -> Integer.parseInt(value)).toArray();
        ArrayDeque<Integer> stackOfNums = new ArrayDeque<>();

        for(int num : nums){
            stackOfNums.push(num);
        }
        for (int num:stackOfNums) {
            System.out.print(num + " ");
        }
    }
}

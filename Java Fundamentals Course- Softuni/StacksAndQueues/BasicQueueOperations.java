package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(value -> Integer.parseInt(value)).toArray();
        int n = parameters[0];
        int s = parameters[1];
        int x = parameters[2];

        int[] numsToAdd = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(value -> Integer.parseInt(value)).toArray();

        ArrayDeque<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            nums.offer(numsToAdd[i]);
        }



        while (s > 0 && !nums.isEmpty()) {
            nums.pop();
            s--;
        }

        int min = Integer.MAX_VALUE;
        if (nums.contains(x)) {
            System.out.println("true");
        } else if(!nums.isEmpty()) {
            for (int num: nums) {
                if(num < min){
                    min = num;
                }
            }
            System.out.println(min);
        } else{
            System.out.println(0);
        }
    }
}

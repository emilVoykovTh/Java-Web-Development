package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int initialLength = nums.length - 1;

        for (int i = 0; i < initialLength; i++) {
            int[] condensed= new int[nums.length - 1];
            for (int j = 0; j < condensed.length; j++) {
                condensed[j] += nums[j] + nums[j + 1];
            }

            nums = condensed;
        }
        System.out.println(nums[0]);
    }
}


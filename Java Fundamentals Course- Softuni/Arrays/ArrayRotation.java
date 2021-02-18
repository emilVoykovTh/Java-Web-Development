package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int index = Integer.parseInt(scanner.nextLine());

        if (index >= nums.length) {
            index = index % nums.length;
        }

        String resultToString = "";
        int[] result = new int[nums.length];

        for (int i = index; i < nums.length; i++) {
            result[0 + (i - index)] = nums[i];
        }

        for (int k = 0; k < index; k++) {
            result[(nums.length - index) + k] = nums[k];
        }


        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                resultToString += String.valueOf(result[i]) + " ";
            } else {
                resultToString += String.valueOf(result[i]);

            }
        }
        System.out.println(resultToString);
    }
}


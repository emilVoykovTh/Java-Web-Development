package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        String result = "";

        for (int i = 0; i < nums.length; i++) {
            int topInt = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]){
                    break;
                }else{
                    topInt += 1;
                }
            }if (topInt == nums.length - i - 1) {
                result += String.valueOf(nums[i]) + " ";
            }
        }
        System.out.println(result);
    }
}


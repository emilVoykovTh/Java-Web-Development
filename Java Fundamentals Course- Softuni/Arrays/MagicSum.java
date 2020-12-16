package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nums.length; i++) {
            int checkNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(checkNum + nums[j] == num){
                    System.out.println(checkNum + " " + nums[j]);
                }
            }
        }
    }
}


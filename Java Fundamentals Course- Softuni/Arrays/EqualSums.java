package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if(nums.length == 1){
                System.out.println(0);
                break;
            }
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if(leftSum != rightSum && i == nums.length - 1){
                System.out.println("no");
                break;
            }else if(leftSum == rightSum){
                System.out.println(i);
                break;
            }
        }
    }
}


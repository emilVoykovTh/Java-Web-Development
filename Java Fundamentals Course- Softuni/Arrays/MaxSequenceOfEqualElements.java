package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int maxCount = Integer.MIN_VALUE;
        int maxSequence = 0;
        for (int i = 0; i < nums.length; i++) {
            int numInSequence = nums[i];
            int counter = 0;
            for (int j = i; j < nums.length; j++) {
                if(numInSequence == nums[j]){
                    counter++;
                    if(counter > maxCount && nums.length - 1 == j){
                        maxSequence = numInSequence;
                        maxCount = counter;
                    }
                    continue;
                }else{
                    if(counter > maxCount){
                        maxSequence = numInSequence;
                        maxCount = counter;
                    }
                    break;
                }
            }
            i+= counter - 1;
        }
        for (int i = 0; i < maxCount; i++) {
            if(i != maxCount - 1){
                System.out.print(maxSequence + " ");
            }else{
                System.out.print(maxSequence);

            }
        }
    }
}


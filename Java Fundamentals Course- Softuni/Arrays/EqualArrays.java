package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int maxLength = Integer.MIN_VALUE;
        if(firstArr.length > secondArr.length){
            maxLength = firstArr.length;
        }else{
            maxLength = secondArr.length;
        }

        int sum = 0;

        for (int i = 0; i < maxLength; i++) {
            if (firstArr[i] != secondArr[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }else{
                sum += firstArr[i];
            }
            if(i == maxLength - 1){
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }

        }

    }
}


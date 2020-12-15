package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        String zigZagArr1 = "";
        String zigZagArr2 = "";
        for (int i = 0; i < n; i++) {
            int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(value -> Integer.parseInt(value)).toArray();
            if (i % 2 == 0) {
                array1[i] = nums[1];
                array2[i] = nums[0];
            } else {
                array1[i] = nums[0];
                array2[i] = nums[1];
            }
            if (i != n - 1) {
                zigZagArr1 += array1[i] + " ";
                zigZagArr2 += array2[i] + " ";
            }else{
                zigZagArr1 += array1[i];
                zigZagArr2 += array2[i];
            }

        }
        System.out.println(zigZagArr2);
        System.out.println(zigZagArr1);
    }
}


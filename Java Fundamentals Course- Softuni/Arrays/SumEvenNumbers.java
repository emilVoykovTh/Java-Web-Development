package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) % 2 == 0){
                sum += Integer.parseInt(numbers[i]);
            }
        }
        System.out.println(sum);
    }
}

package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if(sumOfDigitsisDevisibleBy8(i) && hasMinimumOneOddDig(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean hasMinimumOneOddDig(int i) {
        String digits = String.valueOf(i);
        for (int j = 0; j < digits.length(); j++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(j)));
            if(digit % 2 != 0 && digit != 0){
                return true;
            }
        }
        return false;
    }

    private static boolean sumOfDigitsisDevisibleBy8(int i) {
        String digits = String.valueOf(i);
        int sum = 0;
        for (int j = 0; j < digits.length(); j++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(j)));
            sum += digit;
        }
        if(sum % 8 == 0){
            return true;
        }return false;
    }
}


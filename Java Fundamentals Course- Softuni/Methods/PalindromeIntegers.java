package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            System.out.println(isPalindrome(num));
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int num) {
        String digits = String.valueOf(num);
        int lengthOfNum = digits.length();
        int j = lengthOfNum - 1;
        for (int i = 0; i < lengthOfNum; i++) {
            if (digits.charAt(i) == digits.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}


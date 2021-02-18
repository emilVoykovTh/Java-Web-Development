package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int vowelsCount = countVowels(string);
        System.out.println(vowelsCount);
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                case 'y':
                case 'A':
                case 'O':
                case 'U':
                case 'E':
                case 'I':
                case 'Y':
                    count++;
                    break;
            }

        }
        return count;
    }
}


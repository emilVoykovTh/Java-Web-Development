package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        printCharactersInBetween(firstChar, secondChar);
    }

    public static void printCharactersInBetween(char firstChar, char secondChar) {
        String characters = "";
        if (firstChar < secondChar) {
            for (char i = (char) (firstChar + 1); i < secondChar; i++) {
                if (i != (char) (secondChar - 1)) {
                    System.out.print((char) (i) + " ");
                } else {
                    System.out.println((char)(i));
                }
            }
        } else {
            for (int i = (char) (secondChar + 1); i < firstChar; i++) {
                if (i != (char) (firstChar - 1)) {
                    System.out.print((char)(i) + " ");
                } else {
                    System.out.print((char)(i));
                }
            }
        }
    }
}


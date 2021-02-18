package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isBetween6And10 = isBetween6And10(password);
        boolean hasOnlyLettersAndDigits = hasOnlyLettersAndDigits(password);
        boolean hasMinimumTwoDigits = hasMinimumTwoDigits(password);

        if(isBetween6And10 && hasOnlyLettersAndDigits && hasMinimumTwoDigits){
            System.out.println("Password is valid");
        }
        if(!isBetween6And10){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!hasOnlyLettersAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!hasMinimumTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isBetween6And10(String password) {
        if (password.length() < 6 || password.length() > 10) {
            return false;
        }
        return true;
    }

    private static boolean hasOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }
    private static boolean hasMinimumTwoDigits(String password){
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if(Character.isDigit(symbol)){
                counter++;
                continue;
            }
        }
        if(counter >= 2){
            return true;
        }return false;
    }
}


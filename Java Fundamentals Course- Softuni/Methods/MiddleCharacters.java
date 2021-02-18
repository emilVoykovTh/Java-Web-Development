package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String result = printMiddleChars(string);
        System.out.println(result);
    }

    private static String printMiddleChars(String string) {
        if(string.length() % 2 == 0){
            return String.valueOf(string.charAt(string.length()/2 -1))
                    + String.valueOf(string.charAt(string.length()/2));
        }else{
            return String.valueOf(string.charAt(string.length()/ 2));
        }
    }
}


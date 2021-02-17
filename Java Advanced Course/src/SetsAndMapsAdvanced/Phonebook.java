package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();
        String input = scanner.nextLine();

        while (!"search".equals(input)) {
            String[] contactParts = input.split("-");
            contacts.put(contactParts[0], contactParts[1]);
            input = scanner.nextLine();
        }

        while (!"stop".equals(input = scanner.nextLine())) {
            if (contacts.containsKey(input)) {
                String name = input;
                String phone = contacts.get(input);
                System.out.printf("%s -> %s%n", name, phone);
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
        }


    }

}

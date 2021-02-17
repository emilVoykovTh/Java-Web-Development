package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emailAndName = new LinkedHashMap<>();
        String input;

        while(!"stop".equals(input = scanner.nextLine())){
            String name = input;
            input = scanner.nextLine();
            String email = input;
            emailAndName.put(name, email);
        }

        for (String s : emailAndName.keySet()) {
            if(emailAndName.get(s).endsWith(".us") || emailAndName.get(s).endsWith(".uk") || emailAndName.get(s).endsWith(".com")){
                continue;
            }
            System.out.println(String.format("%s -> %s", s, emailAndName.get(s)));
        }
    }
}

package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namesCount = Integer.parseInt(scanner.nextLine());
        Set<String> uniquenames = new LinkedHashSet<>();
        for (int i = 0; i < namesCount; i++) {
            String name = scanner.nextLine();
            uniquenames.add(name);
        }

        uniquenames.forEach(e -> System.out.println(e));

    }
}

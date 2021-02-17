package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resource = new HashMap<>();
        String input;

        while (!"stop".equals(input = scanner.nextLine())) {
            String resourceType = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resource.containsKey(resourceType)) {
                resource.replace(resourceType, resource.get(resourceType) + quantity);
            } else {
                resource.put(resourceType, quantity);
            }
        }

        for (String s : resource.keySet()) {
            System.out.println(String.format("%s -> %s", s, resource.get(s)));
        }


    }
}

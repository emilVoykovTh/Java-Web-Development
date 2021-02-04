package SetsAndMapsAdvanced;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> values = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {

            if(!values.containsKey(input.charAt(i))){
                values.put(input.charAt(i), 1);
            }else{
                int value = values.get(input.charAt(i));
                value++;
                values.replace(input.charAt(i), value);
            }
        }

        for (Character symbol : values.keySet()){
            System.out.printf("%c: %d time/s%n", symbol, values.get(symbol));
        }
    }
}

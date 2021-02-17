package SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> playerCards = new LinkedHashMap<>();
        String input;

        //fill playerCards in a set
        while (!"JOKER".equals(input = scanner.nextLine())) {
            String[] nameAndCards = input.split(": ");
            String name = nameAndCards[0];
            String[] cards = nameAndCards[1].split(", ");
            if (!playerCards.containsKey(name)) {
                Set<String> currentCards = new HashSet<>();
                for (int i = 0; i < cards.length; i++) {
                    currentCards.add(cards[i]);
                }
                playerCards.put(name, currentCards);
            } else {
                for (int i = 0; i < cards.length; i++) {
                    playerCards.get(name).add(cards[i]);
                }
            }
        }

        //calculate cards value

        for (String name : playerCards.keySet()) {
            int num = 0;
            int multiplicator = 0;
            int result = 0;
            for (String element : playerCards.get(name)) {

                if (element.length() == 3) {
                    num = Integer.parseInt(element.substring(0, 2));
                } else {
                    if (Character.isDigit(element.charAt(0))) {
                        num = Integer.parseInt(element.substring(0, 1));
                    } else {
                        switch (element.charAt(0)) {
                            case 'J':
                                num = 11;
                                break;
                            case 'Q':
                                num = 12;
                                break;
                            case 'K':
                                num = 13;
                                break;
                            case 'A':
                                num = 14;
                                break;
                        }
                    }
                }
                switch (element.charAt(element.length() - 1)) {
                    case 'S':
                        multiplicator = 4;
                        break;
                    case 'H':
                        multiplicator = 3;
                        break;
                    case 'D':
                        multiplicator = 2;
                        break;
                    case 'C':
                        multiplicator = 1;
                        break;
                }
                result += num * multiplicator;
            }
            System.out.println(String.format("%s: %d", name, result));
        }
    }
}

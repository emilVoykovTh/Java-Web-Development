package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandParts[1]);
                    int index = Integer.parseInt(commandParts[2]);
                    if (index < numbers.size() && index >= 0) {
                        numbers.add(index, numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commandParts[1]);
                    if (indexToRemove < numbers.size() && indexToRemove >= 0) {
                        numbers.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                        String direction = commandParts[1];
                        int count = Integer.parseInt(commandParts[2]);
                        shift(numbers, direction, count);
                    break;
            }
            input = scanner.nextLine();
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
    //end of main

    private static void shift(List<Integer> numbers, String direction, int count) {
        if(direction.equals("left")){
            for (int i = 0; i < count; i++) {
                int first = numbers.get(0);
                numbers.remove(0);
                numbers.add(first);
            }
        }
        if(direction.equals("right")){
            for (int i = 0; i < count; i++) {
                int last = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(0, last);
            }
        }
    }
}

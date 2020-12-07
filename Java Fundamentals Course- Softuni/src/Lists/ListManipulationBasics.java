package Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            String[] commandParts = input.split(" ");

            switch (commandParts[0]){
                case "Add":
                    numbers.add(Integer.parseInt(commandParts[1]));
                    break;
                case"Remove":
                    numbers.remove(numbers.indexOf(Integer.parseInt(commandParts[1])));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commandParts[2]), Integer.parseInt(commandParts[1]));
                    break;
                default:
                    System.out.println("Invalid Command: " + commandParts[0]);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.size() - 1 != i){
                System.out.print(numbers.get(i) + " ");
            }else{
                System.out.print(numbers.get(i));
            }

        }
    }
}

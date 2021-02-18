package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String winner = "";

        while (!(firstHand.isEmpty() || secondHand.isEmpty())) {
            int firstP1 = firstHand.get(0);
            int firstP2 = secondHand.get(0);

            if (firstP1 > firstP2) {
                firstHand.add(firstP1);
                firstHand.add(firstP2);
            } else if (firstP2 > firstP1){
                secondHand.add(firstP2);
                secondHand.add(firstP1);
            }
            firstHand.remove(0);
            secondHand.remove(0);
        }

        int sum = 0;
        if (!firstHand.isEmpty()) {
            for (Integer num :firstHand){
                sum += num;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else if(!secondHand.isEmpty()){
            for (Integer num : secondHand){
                sum += num;
            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }

    }
}

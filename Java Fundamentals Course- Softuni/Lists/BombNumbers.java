package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] bomb = scanner.nextLine().split("\\s+");
        int specialNumber = Integer.parseInt(bomb[0]);
        int power = Integer.parseInt(bomb[1]);

        while (numbers.contains(specialNumber)) {
            int positionOfBomb = numbers.indexOf(specialNumber);
            int leftBoundaryIndex = Math.max(0, numbers.indexOf(specialNumber) - power);
            int rightBoundaryIndex = Math.min(numbers.size() - 1, numbers.indexOf(specialNumber) + power);

            for (int i = rightBoundaryIndex; i >= leftBoundaryIndex ; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        System.out.println(sum);


    }
}

package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());

        int sum = add(firstInt, secondInt);
        System.out.println(subtract(sum, thirdInt));
    }

    private static int subtract(int sum, int thirdInt) {
        return sum - thirdInt;
    }

    private static int add(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }
}


package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> elements = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split("\\s+");
            switch (commandParts[0]){
                case "1":
                    int x = Integer.parseInt(commandParts[1]);
                    elements.push(x);
                    break;
                case "2":
                    if(!elements.isEmpty()){
                        elements.pop();
                    }
                    break;
                case "3":
                    int max = Integer.MIN_VALUE;
                    if(!elements.isEmpty()){
                        for (int num : elements){
                            if(num> max){
                                max = num;
                            }
                        }
                        System.out.println(max);
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}

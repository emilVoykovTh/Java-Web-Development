package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String currentSymbol = input[i];
            if (Character.isDigit(currentSymbol.charAt(0)) || Character.isAlphabetic(currentSymbol.charAt(0))) {
                queue.offer(currentSymbol);
            } else {
                if (stack.isEmpty()) {
                    stack.push(currentSymbol);
                } else {
                    switch (currentSymbol) {
                        case "*":
                            if (!stack.isEmpty()) {
                                if (stack.peek().equals('*')) {
                                    queue.offer(stack.pop());
                                }
                            } else {
                                stack.push(currentSymbol);
                            }
                            break;
                        case "+":

                            if (stack.peek().equals("+")) {
                                queue.offer(stack.pop());
                            }
                            while (!stack.isEmpty()) {
                                if (stack.peek().equals("*") || stack.peek().equals("/")) {
                                    queue.offer(stack.pop());
                                    continue;
                                }
                                break;
                            }

                            stack.push(currentSymbol);

                            break;
                        case "/":
                            if (stack.isEmpty()) {
                                stack.push(currentSymbol);
                            } else if (stack.peek().equals('/')) {
                                queue.offer(stack.pop());
                                break;
                            }
                            stack.push(currentSymbol);
                            break;
                        case "-":
                            if (stack.isEmpty()) {
                                stack.push(currentSymbol);
                            } else if (stack.peek().equals('-')) {
                                queue.offer(stack.pop());
                                break;
                            }
                            while (stack.peek().equals('*') || stack.peek().equals('/')) {
                                queue.offer(stack.pop());
                            }
                            stack.push(currentSymbol);
                            break;
                        case "(":
                            stack.push(currentSymbol);
                            break;
                        case ")":

                            while (!stack.isEmpty()) {
                                if(!stack.peek().equals("("))
                                queue.offer(stack.pop());
                                else{
                                    stack.pop();
                                    break;
                                }
                            }
                            break;
                    }
                }
            }
        }


        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        for (String character : queue) {
            System.out.print(character + " ");
        }
    }
}

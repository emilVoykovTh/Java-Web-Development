package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parentheses = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        String output = "";

        for (int i = 0; i < parentheses.length() / 2; i++) {
            stack.push(parentheses.charAt(i));
        }
        for (int i = parentheses.length() / 2; i < parentheses.length(); i++) {
            switch (parentheses.charAt(i)){
                case')':
                    if(stack.pop() != '('){
                        output = "NO";
                    }
                    break;
                case ']':
                    if(stack.pop() != '['){
                        output = "NO";
                    }
                    break;
                case '}':
                    if(stack.pop() != '{'){
                        output = "NO";
                    }
                    break;
                case '(':
                    output = "NO";
                    break;
                case'[':
                    output = "NO";
                    break;
                case'{':
                    output = "NO";
                    break;

            }
            if(output.equals("NO")){
                System.out.println(output);
                break;
            }
        }
        if(output.equals("")){
            System.out.println("YES");
        }

    }
}

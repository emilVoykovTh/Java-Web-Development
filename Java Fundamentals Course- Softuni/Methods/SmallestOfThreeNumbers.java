package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int firstSmallerNum = findSmallestNum(firstNum, secondNum);
        int smallestNum = findSmallestNum(firstSmallerNum,thirdNum);
        System.out.println(smallestNum);
    }

    public static int findSmallestNum(int a, int b) {
        if (a < b){
            return a;
        }else{
            return b;
        }
    }
}


package Methods;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        calculateTheClosestPoint(x1, x2, y1, y2);
    }

    private static void calculateTheClosestPoint(int x1, int x2, int y1, int y2) {
        if (Math.sqrt(x1 * x1 + y1 * y1) < Math.sqrt(x2 * x2 + y2 * y2))
        {
            System.out.printf("(%d, %d)", x1, y1);
        }
        else
        {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}


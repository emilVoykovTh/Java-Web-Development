package Methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = scanner.nextLine();
        String input = scanner.nextLine();
        modifyData(dataType, input);

    }

    private static void modifyData(String dataType, String input) {
        switch (dataType) {
            case "int":
                int num = Integer.parseInt(input);
                System.out.println(num * 2);
                break;
            case "real":
                double realNum = Double.parseDouble(input);
                System.out.printf("%.2f", realNum * 1.5);
                break;
            case "string":
                System.out.printf("$%s$",input);
                break;
        }
    }
}


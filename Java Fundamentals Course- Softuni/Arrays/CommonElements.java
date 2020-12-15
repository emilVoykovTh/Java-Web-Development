package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split("\\s+");
        String[] array2 = scanner.nextLine().split("\\s+");
        String commonElements = "";
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].equals(array1[j])) {
                    if (i != array2.length - 1) {
                        commonElements += array2[i] + " ";
                    } else {
                        commonElements += array2[i];
                    }
                }
            }

        }
        System.out.println(commonElements);
    }
}

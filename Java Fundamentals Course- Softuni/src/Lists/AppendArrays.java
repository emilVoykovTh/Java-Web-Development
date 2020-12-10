package Lists;

import java.util.*;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrays = scanner.nextLine().split("\\|");
        List<String> numbers = new  ArrayList<>();

        for (int i = arrays.length - 1; i >= 0; i--) {
            String[] currentArray = arrays[i].split("\\s+");
            for (int j = 0; j < currentArray.length; j++) {
                if(!currentArray[j].equals("")){
                    numbers.add(currentArray[j]);
                }
            }
        }
        System.out.println(String.join(" ", numbers));

    }
}

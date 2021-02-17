package genericsExercises.P04Froggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stones = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = "";
        Lake lake = new Lake(stones);

        Iterator<Integer> froggy = lake.iterator();
        List<String> result = new ArrayList<>();
        while (froggy.hasNext()){
            result.add(froggy.next() + "");
        }
        System.out.print(String.join(", ", result));

    }
}

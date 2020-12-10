package Lists;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> trainCars = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengersPerCar = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] commandParts = input.split("\\s+");
            if(commandParts[0].equals("Add")){
                int passengers = Integer.parseInt(commandParts[1]);
                trainCars.add(passengers);
            }else{
                int passengers = Integer.parseInt(commandParts[0]);
                for (int i = 0; i < trainCars.size(); i++) {
                    int totalPassengers = trainCars.get(i) + passengers;
                    if(totalPassengers <= maxPassengersPerCar){
                        trainCars.set(i, totalPassengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for(Integer car : trainCars){
            System.out.print(car + " ");
        }
    }
}

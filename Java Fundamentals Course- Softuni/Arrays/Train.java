package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] trainCars = new int[n];
        int sumPeople = 0;
        String peoplePerCar = "";

        for (int i = 0; i < n; i++) {
            trainCars[i] = Integer.parseInt(scanner.nextLine());
            sumPeople += trainCars[i];
            if(i != n-1) {
                peoplePerCar += String.valueOf(trainCars[i]) + " ";
            }else{
                peoplePerCar += String.valueOf(trainCars[i]);
            }
        }
        System.out.println(peoplePerCar);
        System.out.println(sumPeople);

    }
}

package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] weekDays = {"Invalid day!","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int input = Integer.parseInt(scanner.nextLine());
        if(input >= 1 && input <= 7){
            System.out.println(weekDays[input]);
        }else{
            System.out.println(weekDays[0]);
        }
    }
}

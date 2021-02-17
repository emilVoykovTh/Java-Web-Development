package genericsExercises.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String line = "";

        while (!"END".equals(line = scanner.nextLine())) {
            String[] personInfo = line.split("\\s+");
            Person person = new Person(personInfo[0], Integer.parseInt(personInfo[1]), personInfo[2]);
            personList.add(person);
        }
        int index = Integer.parseInt(scanner.nextLine());
        Person searchPerson = personList.get(index - 1);
        int equalPeople = 0;

        for (Person person : personList) {
            if (person.compareTo(searchPerson) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", equalPeople, personList.size() - equalPeople, personList.size()));
        }
    }
}

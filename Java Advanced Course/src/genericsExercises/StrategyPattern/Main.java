package genericsExercises.StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Person> peopleByName = new TreeSet<>(new ComparatorByName());
        Set<Person> peopleByAge = new TreeSet<>(new ComparatorByAge());


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            peopleByAge.add(person);
            peopleByName.add(person);
        }

        peopleByName.forEach(person -> System.out.println(person.toString()));
        peopleByAge.forEach(person -> System.out.println(person.toString()));

    }
}

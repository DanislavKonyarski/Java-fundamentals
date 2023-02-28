package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3OpinionPoll {
    public static class Person{
        String name;
        Integer age;

        public Person(String name,Integer age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String input = scanner.nextLine();
            Person inputPerson = new Person(input.split(" ")[0],Integer.parseInt(input.split(" ")[1]));
            personList.add(inputPerson);
        }
        for (Person person : personList) {
            if (person.age>30){
                System.out.println(person.name+" - "+person.age);
            }
        }
    }
}

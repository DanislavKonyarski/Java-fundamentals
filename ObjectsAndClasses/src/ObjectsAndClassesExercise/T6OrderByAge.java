package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class T6OrderByAge {
    static class Person{
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Person> order = new ArrayList<>();
        while (!command.equals("End")){
            String[] commandArr = command.split("\\s+");
            Person newPerson = new Person(commandArr[0],commandArr[1],Integer.parseInt(commandArr[2]));
            order.add(newPerson);
            command = scanner.nextLine();
        }
        order.sort(Comparator.comparing(Person::getAge));
        for (Person person : order) {
            System.out.printf("%s with ID: %s is %d years old.%n",person.name,person.id,person.age);
        }
    }
}

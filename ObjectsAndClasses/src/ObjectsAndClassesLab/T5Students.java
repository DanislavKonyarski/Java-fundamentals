package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T5Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!input.equals("end")) {
            Student newStudent = new Student(input.split(" ")[0], input.split(" ")[1],
                    input.split(" ")[2], input.split(" ")[3]);
            students.add(newStudent);
            input = scanner.nextLine();
        }
        String inputTown = scanner.nextLine();
        for (Student student : students) {
            if (student.town.equals(inputTown)) {
                System.out.printf("%s %s is %s years old%n", student.firstName, student.lastName, student.age);
            }
        }
    }
}

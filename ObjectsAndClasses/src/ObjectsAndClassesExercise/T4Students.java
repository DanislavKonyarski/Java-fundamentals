package ObjectsAndClassesExercise;

import java.util.*;

public class T4Students {
    public static class Student {
        public double getGrade() {
            return grade;
        }

        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstName = input.split("\\s+")[0];
            String secondName = input.split("\\s+")[1];
            double grade = Double.parseDouble(input.split("\\s+")[2]);
            Student newStudent = new Student(firstName,secondName,grade);
            studentList.add(newStudent);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n",student.firstName,student.lastName,student.grade);
        }
    }
}

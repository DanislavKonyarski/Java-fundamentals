package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T6Students2 {
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
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")){
            String[] newStudent = input.split(" ");
            Student studentForList =  new Student(newStudent[0],newStudent[1],newStudent[2],newStudent[3]);
            boolean flag = false;
            int index = -1;
            for (Student s :studentList) {
                if (s.firstName.equals(newStudent[0])&&s.lastName.equals(newStudent[1])){
                    flag = true;
                    index =  studentList.indexOf(s);
                }
            }
             if (flag){
                 studentList.set(index,studentForList);
             }else {
            studentList.add(studentForList);
             }
            input= scanner.nextLine();
        }
        String inputTown = scanner.nextLine();
        for (Student student : studentList) {
            if (student.town.equals(inputTown)){
                System.out.printf("%s %s is %s years old%n",student.firstName,student.lastName,student.age);
            }
        }
    }
}

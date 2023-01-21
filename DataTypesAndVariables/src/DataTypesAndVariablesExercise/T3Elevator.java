package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int person = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        double courses = Math.ceil(person / (double) capacity);
        System.out.printf("%.0f",courses);
    }
}

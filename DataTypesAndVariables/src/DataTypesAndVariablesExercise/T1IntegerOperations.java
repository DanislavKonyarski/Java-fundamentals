package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T1IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberTree = Integer.parseInt(scanner.nextLine());
        int numberFour = Integer.parseInt(scanner.nextLine());
        int sum = ((numberOne+numberTwo)/numberTree)*numberFour;
        System.out.println(sum);
    }
}

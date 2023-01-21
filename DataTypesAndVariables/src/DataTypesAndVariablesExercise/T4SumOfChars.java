package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T4SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countChar = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < countChar; i++) {
            char input = scanner.nextLine().charAt(0);
            sum += input;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}

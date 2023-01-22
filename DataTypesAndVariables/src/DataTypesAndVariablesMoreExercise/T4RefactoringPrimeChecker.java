package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class T4RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= countNumber; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, flag);
        }

    }
}

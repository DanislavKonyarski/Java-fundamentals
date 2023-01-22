package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class T2FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String numOne = "";
            String numTwo = "";
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == 32) {
                    numOne = numTwo;
                    numTwo = "";
                    continue;
                }
                numTwo += symbol;
            }
            long currentNumOne = Long.parseLong(numOne);
            long currentNumTwo = Long.parseLong(numTwo);
            int sum = 0;
            if (currentNumOne > currentNumTwo) {
                while (currentNumOne != 0) {
                    sum += currentNumOne % 10;
                    currentNumOne /= 10;
                }
            } else {
                while (currentNumTwo != 0) {
                    sum += currentNumTwo % 10;
                    currentNumTwo /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}

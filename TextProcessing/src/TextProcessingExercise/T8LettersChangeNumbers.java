package TextProcessingExercise;

import java.util.Scanner;

public class T8LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String currentInput : inputArr) {
            StringBuilder numberString = new StringBuilder();
            for (int j = 0; j < currentInput.length(); j++) {
                if (j != 0 && j != currentInput.length() - 1) {
                    numberString.append(currentInput.charAt(j));
                }
            }
            double number = Double.parseDouble(numberString.toString());
            boolean upperCase = Character.isUpperCase(currentInput.charAt(currentInput.length() - 1));
            int numUpperCase = currentInput.charAt(currentInput.length() - 1) - 64;
            int numLowerCase = currentInput.charAt(currentInput.length() - 1) - 96;
            if (Character.isUpperCase(currentInput.charAt(0))) {
                int numLetter = currentInput.charAt(0) - 64;
                double currentSum = 0;
                currentSum = number / numLetter;
                if (upperCase) {
                    numLetter = numUpperCase;
                    currentSum -= numLetter;
                } else {
                    numLetter = numLowerCase;
                    currentSum += numLetter;
                }
                sum += currentSum;
            } else if (Character.isLowerCase(currentInput.charAt(0))) {
                int numLetter = currentInput.charAt(0) - 96;
                double currentSum = 0;
                currentSum += number * numLetter;
                if (upperCase) {
                    numLetter = numUpperCase;
                    currentSum -= numLetter;
                } else {
                    numLetter = numLowerCase;
                    currentSum += numLetter;
                }
                sum += currentSum;
            }
        }
        System.out.printf("%.2f", sum);
        ;
    }
}

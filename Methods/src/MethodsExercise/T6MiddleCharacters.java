package MethodsExercise;

import java.util.Scanner;

public class T6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        midChar(input);
    }

    public static void midChar(String input) {
        if (input.length() % 2 == 0) {
            System.out.printf("%c%c%n",input.charAt((input.length() / 2)-1), input.charAt((input.length() / 2) ));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}

package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T6TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i < input+97; i++) {
            for (int j = 97; j < 97+input; j++) {
                for (int k = 97; k < 97+input; k++) {
                    System.out.printf("%s%s%s%n",(char)i,(char)j,(char)k);
                }
            }
        }
    }
}

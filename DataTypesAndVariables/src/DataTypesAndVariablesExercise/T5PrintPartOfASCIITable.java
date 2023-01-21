package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T5PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startIndexChar = Integer.parseInt(scanner.nextLine());
        int finalIndexChar = Integer.parseInt(scanner.nextLine());
        for (int i = startIndexChar; i <= finalIndexChar ; i++) {
            System.out.printf("%s ",(char)i);
        }
    }
}

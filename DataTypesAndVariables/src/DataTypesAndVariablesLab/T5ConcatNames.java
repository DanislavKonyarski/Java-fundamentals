package DataTypesAndVariablesLab;

import java.util.Scanner;

public class T5ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String symbol = scanner.nextLine();
        System.out.println(firstName+symbol+lastName);
    }
}

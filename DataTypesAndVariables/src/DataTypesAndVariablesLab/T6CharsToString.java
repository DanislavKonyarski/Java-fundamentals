package DataTypesAndVariablesLab;

import java.util.Scanner;

public class T6CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char treeChar = scanner.nextLine().charAt(0);
        System.out.printf("%s%s%s",firstChar,secondChar,treeChar);
    }
}

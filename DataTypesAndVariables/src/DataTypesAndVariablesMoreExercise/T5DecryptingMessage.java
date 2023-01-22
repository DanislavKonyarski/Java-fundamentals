package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class T5DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int countSymbol = Integer.parseInt(scanner.nextLine());
        String name = "";
        for (int i = 0; i < countSymbol; i++) {
            char symbol = scanner.nextLine().charAt(0);
            symbol = (char) (symbol + key);
            name+=symbol;
        }
        System.out.println(name);
    }
}

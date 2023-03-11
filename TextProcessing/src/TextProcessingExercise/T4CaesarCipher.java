package TextProcessingExercise;

import java.util.Scanner;

public class T4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char newSymbol = (char) (text.charAt(i)+3);
            newText.append(newSymbol);
        }
        System.out.println(newText);
    }
}

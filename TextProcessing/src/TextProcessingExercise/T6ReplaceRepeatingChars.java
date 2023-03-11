package TextProcessingExercise;

import java.util.Scanner;

public class T6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder finalText = new StringBuilder();
        finalText.append(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            if (finalText.charAt(finalText.length()-1)!=text.charAt(i)){
                finalText.append(text.charAt(i));
            }
        }
        System.out.println(finalText);
    }
}

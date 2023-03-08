package TextProcessingLab;

import java.util.Scanner;

public class T4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordBaned = scanner.nextLine().split(",\\s+");
        String text = scanner.nextLine();
        for (String s : wordBaned) {
            StringBuilder currentWord = new StringBuilder();
            currentWord.append("*".repeat(s.length()));

            text = text.replace(s, currentWord.toString());


        }
        System.out.println(text);
    }
}

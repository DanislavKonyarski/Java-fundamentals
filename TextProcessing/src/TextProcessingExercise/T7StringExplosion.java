package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            newText.append(text.charAt(i));
            if (text.charAt(i) == '>') {
                if (Character.isDigit(text.charAt(i + 1))) {
                    int powerBomb = Character.getNumericValue(text.charAt(i + 1)) + count;
                    count = 0;
                    int currentI = i;
                    for (int j = currentI + 1; j < currentI + 1 + powerBomb; j++) {
                        if (text.charAt(j) != '>') {
                            i += 1;
                            if (i + 1 == text.length()) {
                                break;
                            }
                        } else {
                            count = (currentI + 1 + powerBomb) - j;
                            break;
                        }
                    }
                } else {
                    int currentI = i;
                    for (int j = currentI + 1; j < currentI + 1 + count; j++) {
                        if (text.charAt(j) != '>') {
                            i += 1;
                        } else {
                            count = (currentI + 1 + count) - j;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(newText);
    }
}

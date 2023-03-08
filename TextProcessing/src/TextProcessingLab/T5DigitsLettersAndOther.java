package TextProcessingLab;

import java.util.Scanner;

public class T5DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder character = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (Character.isDigit(currentSymbol)){
               digit.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)) {
                letter.append(currentSymbol);
            }else {
                character.append(currentSymbol);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(character);
    }
}

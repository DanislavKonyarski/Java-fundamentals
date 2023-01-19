package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class T5Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLetter = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countLetter ; i++) {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (number==0){
                System.out.print(" ");
                continue;
            }
            int digit = input.length();
            int mainDigit = number%10;
            int offset = 0;
            if (mainDigit==8||mainDigit==9){
                offset = ((mainDigit - 2) * 3)+1;
            }else {
                offset = (mainDigit - 2) * 3;
            }
            int letterIndex = offset + digit -1;
            char symbol = (char) (letterIndex+97);
            System.out.print(symbol);
        }
    }
}

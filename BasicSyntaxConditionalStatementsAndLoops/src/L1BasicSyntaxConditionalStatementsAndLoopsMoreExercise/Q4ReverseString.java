package L1BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Q4ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String word = "";
        for (int i = input.length()-1; i >= 0; i--) {
            word+= input.charAt(i);
        }
        System.out.println(word);
    }
}

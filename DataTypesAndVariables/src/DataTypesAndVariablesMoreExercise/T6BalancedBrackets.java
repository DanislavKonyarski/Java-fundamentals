package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class T6BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLine = Integer.parseInt(scanner.nextLine());
        int countOpenBracket = 0;
        int countCloseBracket = 0;
        for (int i = 0; i < countLine; i++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            if (symbol=='('){
                countOpenBracket++;
            } else if (symbol==')'&&countOpenBracket>countCloseBracket) {
                countCloseBracket++;
            }
        }
        if (countCloseBracket==countOpenBracket){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}

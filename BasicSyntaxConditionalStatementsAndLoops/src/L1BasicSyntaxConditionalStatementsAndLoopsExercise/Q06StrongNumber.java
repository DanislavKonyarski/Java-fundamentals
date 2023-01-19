package L1BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Q06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String oneNumber = "";
        int fact = 1;
        int sum = 0;
        for (int i = 0; i < number.length() ; i++) {
            oneNumber += number.charAt(i);
            int input = Integer.parseInt(oneNumber);
            for (int j = 1; j <= input; j++) {
                fact*=j;
            }
            sum+=fact;
            fact=1;
            oneNumber = "";
        }
        int finalNumber = Integer.parseInt(number);
        if (sum==finalNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}

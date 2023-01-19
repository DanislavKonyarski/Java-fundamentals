package BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class T9SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= countNumbers*2 ; i+=2) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("Sum: "+sum);
    }
}

package BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class T10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = 1;
        while (count<=10){
            System.out.printf("%d X %d = %d%n",number,count,number*count);
            count++;
        }
    }
}

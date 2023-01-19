package BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class T11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        do {
            System.out.printf("%d X %d = %d%n",number,count,number*count);
            count++;
        }
        while (count<=10);

    }
}

package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class T9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0.0;
        for (int i = 0; i < n; i++) {
            double priceCapsules = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            double sum = days*countCapsules*priceCapsules;
            total+=sum;
            System.out.printf("The price for the coffee is: $%.2f%n",sum);
        }
        System.out.printf("Total: $%.2f",total);
    }
}

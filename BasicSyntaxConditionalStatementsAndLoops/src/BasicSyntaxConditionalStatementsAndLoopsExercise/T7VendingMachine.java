package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class T7VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!"Start".equals(input)){
            double coin = Double.parseDouble(input);
            if (coin==0.1||coin==0.2||coin==0.5||coin==1||coin==2){
                sum += coin;
                input = scanner.nextLine();
                continue;
            }else {
                System.out.printf("Cannot accept %.2f%n",coin);
                input = scanner.nextLine();
            }
        }input = scanner.nextLine();
        while (!"End".equals(input)){
            if ("Nuts".equals(input)){
                if (sum>=2.0){
                sum -= 2.0;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Water".equals(input)) {
                if (sum>=0.7){
                    sum -= 0.7;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Crisps".equals(input)) {
                if (sum>=1.5){
                    sum -= 1.5;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if ("Soda".equals(input)) {
                if (sum>=0.8){
                    sum -= 0.8;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                };
            } else if ("Coke".equals(input)) {
                if (sum>=1.0){
                    sum -= 1.0;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n",sum);
    }
}

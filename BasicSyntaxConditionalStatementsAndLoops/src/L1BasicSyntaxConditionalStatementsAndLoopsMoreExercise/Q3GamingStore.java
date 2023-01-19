package L1BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Q3GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double sum = money;
        while (!"Game Time".equals(input)){
            if ("OutFall 4".equals(input)){
                if (money>=39.99) {
                    money -= 39.99;
                    System.out.println("Bought " + input);
                }else {
                    System.out.println("Too Expensive");
                }
            } else if ("CS: OG".equals(input)) {
                if (money>=15.99) {
                    money -= 15.99;
                    System.out.println("Bought "+input);
                }else {
                    System.out.println("Too Expensive");
                }
            } else if ("Zplinter Zell".equals(input)) {
                if (money>=19.99){
                money -= 19.99;
                System.out.println("Bought " + input);
            }else {
                    System.out.println("Too Expensive");
                }
            } else if ("Honored 2".equals(input)) {
                if (money>=59.99) {
                    money -= 59.99;
                    System.out.println("Bought " + input);
                }else {
                    System.out.println("Too Expensive");
                }
            } else if ("RoverWatch".equals(input)) {
                if (money>=29.99) {
                    money -= 29.99;
                    System.out.println("Bought " + input);
                }else {
                    System.out.println("Too Expensive");
                }
            } else if ("RoverWatch Origins Edition".equals(input)) {
                if (money>=39.99) {
                    money -= 39.99;
                    System.out.println("Bought " + input);
                }else {
                    System.out.println("Too Expensive");
                }
            }else {
                System.out.println("Not Found");
            }if (money==0){
                System.out.println("Out of money!");
                break;
            }input=scanner.nextLine();
        }if (money>0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum - money, money);
        }
    }
}

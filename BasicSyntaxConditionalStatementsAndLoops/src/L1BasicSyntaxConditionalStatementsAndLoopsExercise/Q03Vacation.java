package L1BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Q03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        if ("Students".equals(typePeople)){
            if ("Friday".equals(day)){
                price = people * 8.45;
            } else if ("Saturday".equals(day)) {
                price = people * 9.8;
            } else if ("Sunday".equals(day)) {
                price = people * 10.46;
            }
            if (people>=30){
                price *= 0.85;
            }
        } else if ("Business".equals(typePeople)) {
            if (people>=100){
                people-=10;
            }
            if ("Friday".equals(day)){
                price = people * 10.90;
            } else if ("Saturday".equals(day)) {
                price = people * 15.60;
            } else if ("Sunday".equals(day)) {
                price = people * 16.0;
            }
        } else if ("Regular".equals(typePeople)) {
            if ("Friday".equals(day)){
                price = people * 15.0;
            } else if ("Saturday".equals(day)) {
                price = people * 20.0;
            } else if ("Sunday".equals(day)) {
                price = people * 22.50;
            }
            if (people>=10&&people<=20){
                price*=0.95;
            }
        }
        System.out.printf("Total price: %.2f",price);
    }
}

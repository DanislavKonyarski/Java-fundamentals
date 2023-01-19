package BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class T7TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0 ;
        if (0<=age&&age<=18){
            switch (day){
                case "Weekday":
                    price = 12;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 5;
                    System.out.printf("%d$",price);
                    break;
                default:
                    System.out.println("Error!");
            }
        } else if (18<age&&age<=64) {
            switch (day){
                case "Weekday":
                    price = 18;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 20;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 12;
                    System.out.printf("%d$",price);
                    break;
                default:
                    System.out.println("Error!");
            }
        } else if (64<age&&age<=122) {
            switch (day){
                case "Weekday":
                    price = 12;
                    System.out.printf("%d$",price);
                    break;
                case "Weekend":
                    price = 15;
                    System.out.printf("%d$",price);
                    break;
                case "Holiday":
                    price = 10;
                    System.out.printf("%d$",price);
                    break;
                default:
                    System.out.println("Error!");
            }
        }else {
            System.out.println("Error!");
        }
    }
}

package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class T3FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        long workNum1 = (long) (num1*1000000);
        long workNum2 = (long) (num2*1000000);
        if (workNum1==workNum2){
            System.out.println("True");
        }else {
                System.out.println("False");
        }
    }
}

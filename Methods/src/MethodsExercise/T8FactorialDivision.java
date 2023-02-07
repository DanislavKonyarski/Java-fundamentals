package MethodsExercise;

import java.util.Scanner;

public class T8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        double sum = factorial(numOne) / factorial(numTwo);
        System.out.printf("%.2f",sum);
    }
    public static double factorial (int num){
        double sum = num;
        for (int i = num-1; i >= 1; i--) {
            sum = sum*i;
        }
        return sum;
    }
}

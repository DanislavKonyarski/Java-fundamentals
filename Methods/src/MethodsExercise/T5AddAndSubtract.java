package MethodsExercise;

import java.util.Scanner;

public class T5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numTree = Integer.parseInt(scanner.nextLine());
        int sum = subtract(add(numOne,numTwo),numTree);
        System.out.println(sum);
    }
    public static int add (int numOne, int numTwo){
        int sum = 0;
        sum = numOne + numTwo;
        return sum;
    }
    public static int subtract (int numOne, int numTwo){
        int sum = numOne - numTwo;
        return sum;
    }
}

package MethodsExercise;

import java.util.Scanner;

public class T1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFirst = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numTree = Integer.parseInt(scanner.nextLine());
        smallestNumber(numFirst,numTwo,numTree);
    }
    public static void smallestNumber (int numOne, int numTwo,int numTree){
        if (numOne>=numTwo){
            if (numOne>=numTree){
                System.out.println(numTree);
            }else {
                System.out.println(numTwo);
            }
        }else {
            System.out.println(numOne);
        }
    }
}

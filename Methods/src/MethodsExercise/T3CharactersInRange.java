package MethodsExercise;

import java.util.Scanner;

public class T3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symOne = scanner.nextLine().charAt(0);
        char symTwo = scanner.nextLine().charAt(0);
        printChars(symOne,symTwo);
    }
    public static void printChars (char symOne, char symTwo){
        if (symOne<=symTwo){
            for (int i = symOne+1; i < symTwo; i++) {
            System.out.print((char) i+" ");
            }
        }else {
            for (int i = symTwo+1; i < symOne; i++) {
                System.out.print((char) i+" ");
            }
        }
    }
}

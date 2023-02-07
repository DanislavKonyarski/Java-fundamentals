package MethodsExercise;

import java.util.Scanner;

public class T7NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        matrix(num);
    }

    public static void matrix(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

}

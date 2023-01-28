package ArraysExercise;

import com.sun.jdi.Value;

import java.util.Scanner;

public class T2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayFirst = scanner.nextLine().split(" ");
        String[] arraySecond = scanner.nextLine().split(" ");
        for (int i = 0; i < arraySecond.length ; i++) {
            for (int j = 0; j < arrayFirst.length; j++) {
                if (arraySecond[i].equals(arrayFirst[j])){
                    System.out.print(arraySecond[i]+" ");
                }
            }
        }
    }
}

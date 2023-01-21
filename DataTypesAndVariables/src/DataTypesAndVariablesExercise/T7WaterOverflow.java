package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPour = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        for (int i = 0; i < countPour; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            if (litres>capacity){
                System.out.println("Insufficient capacity!");
            }else {
                capacity-=litres;
            }
        }
        System.out.println(Math.abs(capacity-255));
    }
}
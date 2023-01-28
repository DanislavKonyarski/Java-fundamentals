package ArraysExercise;

import java.sql.Array;
import java.util.Scanner;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] peopleArr = new int[countWagons];
        int sum = 0;
        for (int i = 0; i < countWagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            peopleArr[i]=people;
        }
        for (int item : peopleArr) {
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

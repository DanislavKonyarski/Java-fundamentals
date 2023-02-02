package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumLet = 0;
        int sumRight = 0;
        boolean flag = true;
        for (int i = 0; i < numberArr.length-1; i++) {
            sumLet += numberArr[i];
            sumRight = 0;
            for (int j = numberArr.length - 1; j > i + 1; j--) {
                sumRight += numberArr[j];
            }
            if (sumLet == sumRight) {
                if ((numberArr.length == 1) || (numberArr.length == 2 && numberArr[1] == 0)) {
                    break;
                }
                System.out.println(i + 1);
                flag = false;
                break;
            }
        }
        if (numberArr.length == 1) {
            System.out.println("0");
        } else if (numberArr.length == 2 && numberArr[1] == 0) {
            System.out.println("0");
        } else if (flag) {
            System.out.println("no");
        }
    }
}

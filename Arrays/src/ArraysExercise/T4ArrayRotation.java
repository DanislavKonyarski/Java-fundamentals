package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countRotations  = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countRotations ; i++) {
            int workNumber = numberArr[0];
            for (int j = 0; j < numberArr.length; j++) {
                if (numberArr.length-2>=j){
                    int secondWorkNumber = numberArr[j+1];
                    numberArr[j] = secondWorkNumber;
                }else {
                    numberArr[numberArr.length-1]=workNumber;
                }
            }
        }
        for (int i : numberArr) {
            System.out.print(i+" ");
        }
    }
}

package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T6EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arraysOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrayTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arraysOne.length; i++) {
            index=i;
            sum += arraysOne[i];
            if (arraysOne[i]!=arrayTwo[i]){
            flag = false;
            break;
            }
        }
        if (flag){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        }
    }
}

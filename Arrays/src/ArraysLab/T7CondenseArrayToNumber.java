package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j <inputArr.length-i ; j++) {
                if (j<(inputArr.length-i)-1)
                inputArr[j]= inputArr[j] + inputArr[j+1];
            }
        }
        System.out.println(inputArr[0]);
    }
}

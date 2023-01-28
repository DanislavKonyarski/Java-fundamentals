package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven = Integer.MIN_VALUE;
        int sumOdd = Integer.MIN_VALUE;
        for (int i = 0; i < numberArr.length ; i++) {
            if (numberArr[i]%2==0){
                sumEven+=numberArr[i];
            }else {
                sumOdd+=numberArr[i];
            }
        }
        System.out.printf("%d",sumEven-sumOdd);
    }
}

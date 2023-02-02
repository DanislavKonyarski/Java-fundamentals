package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int topInteger = Integer.MIN_VALUE;
        int indexTopInteger = -1;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] > topInteger) {
                topInteger = numbersArr[i];
                indexTopInteger = i;
            }
        }
        System.out.print(topInteger + " ");
        for (int j = indexTopInteger + 2; j < numbersArr.length ; j++) {
            if (numbersArr[j -1] > numbersArr[j]) {
                System.out.print(numbersArr[j-1 ] + " ");
            }
            if (j == numbersArr.length-1) {
                System.out.println(numbersArr[numbersArr.length - 1]);
            }
        }
        if (indexTopInteger==numbersArr.length-2){
            System.out.println(numbersArr[numbersArr.length-1]);
        }
    }
}


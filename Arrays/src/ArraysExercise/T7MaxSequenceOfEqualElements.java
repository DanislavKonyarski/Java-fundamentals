package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int maxCount =0;
        int index = 0;
        for (int i = 0; i < numberArr.length-1; i++) {
            if (numberArr[i]==numberArr[i+1]){
                count++;
                if (count>maxCount){
                    maxCount++;
                    index = i+1;
                }
            }else {
                count = 0;
            }
        }
        for (int i = index-maxCount; i <index+1 ; i++) {
            System.out.print(numberArr[i]+" ");
        }
    }
}

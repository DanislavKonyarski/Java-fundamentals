package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberArr.length ; i++) {
            for (int j = i; j < numberArr.length; j++) {
                if (i!=j&&numberArr[i]+numberArr[j]==magicNumber){
                    System.out.println(numberArr[i]+" "+numberArr[j]);
                }
            }
        }
    }
}

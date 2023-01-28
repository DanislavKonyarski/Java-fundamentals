package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLine = Integer.parseInt(scanner.nextLine());
        int[] arrayFirst = new int[countLine];
        int[] arraySecond = new int[countLine];
        for (int i = 0; i < countLine; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if ((i+1)%2==0){
            arraySecond[i]=input[0];
            arrayFirst[i]=input[1];
            }else {
                arraySecond[i]= input[1];
                arrayFirst[i]= input[0];
            }
        }
        for (int i : arrayFirst) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : arraySecond) {
            System.out.print(i+" ");
        }
    }
}

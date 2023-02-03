package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class T9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.next();
        while (!input.equals("end")) {
            if (input.equals("decrease")) {
                for (int i = 0; i < numberArr.length; i++) {
                    numberArr[i] -= 1;
                }
                input = scanner.next();
                continue;
            }
            int index1 = Integer.parseInt(scanner.next());
            int index2 = Integer.parseInt(scanner.next());
            switch (input) {
                case "swap":
                    int workNumber = numberArr[index1];
                    numberArr[index1] = numberArr[index2];
                    numberArr[index2] = workNumber;
                    break;
                case "multiply":
                    numberArr[index1] *= numberArr[index2];
                    break;
            }
            input = scanner.next();
        }
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr.length-1==i){
                System.out.print(numberArr[i]);
            }else {
                System.out.print(numberArr[i]+", ");
            }
        }
    }
}


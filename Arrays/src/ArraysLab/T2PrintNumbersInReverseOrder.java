package ArraysLab;

import java.util.Scanner;

public class T2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInput = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[countInput];
        for (int i = countInput-1; i >= 0; i--) {
            int input = Integer.parseInt(scanner.nextLine());
            numbers[i] = input;
        }
        for (int item : numbers) {
            System.out.print(item+" ");
        }
    }
}

package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int nDivide = 0;
        if (n % 2 == 0) {
            nDivide = n / 2;
        }
        while (n >= m) {
            n = n - m;
            count++;
            if (nDivide == n&&y!=0) {
                n = n / y;
            }

        }
        System.out.println(n);
        System.out.println(count);
    }
}

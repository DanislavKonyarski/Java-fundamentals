package DataTypesAndVariablesLab;

import java.util.Scanner;

public class T12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int workI = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            workI = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            flag = (sum == 5) || (sum == 7) || (sum == 11);
            if (flag){
                System.out.printf("%d -> True%n", workI);
            }else {
                System.out.printf("%d -> False%n", workI);
            }
            sum = 0;
            i = workI;
        }

    }
}

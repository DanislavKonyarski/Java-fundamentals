package DataTypesAndVariablesLab;

import java.util.Scanner;

public class T1ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int metres = Integer.parseInt(scanner.nextLine());
        double km = metres / 1000.0;
        System.out.printf("%.2f",km);
    }
}
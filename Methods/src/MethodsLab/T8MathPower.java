package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T8MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        double matPower = matPow(number,power);
        System.out.println(new DecimalFormat("0.#######").format(matPower));
    }
    public static double matPow (double number, double pow){
        double matPow = 1;
        for (int i = 0; i < pow; i++) {
            matPow *= number;
        }
        return matPow;
    }
}

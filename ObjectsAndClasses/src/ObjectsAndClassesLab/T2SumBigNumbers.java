package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class T2SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numOne = new BigInteger(scanner.nextLine());
        BigInteger numTwo = new BigInteger(scanner.nextLine());
        BigInteger sum = numOne.add(numTwo);
        System.out.println(sum);

    }
}

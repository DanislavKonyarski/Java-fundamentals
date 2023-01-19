package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class T1SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberTri = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 3; i++) {
            if (numberOne>=numberTwo&&numberOne>=numberTri){
                System.out.println(numberOne);
                numberOne = Integer.MIN_VALUE;
            } else if (numberTwo>=numberOne&&numberTwo>=numberTri) {
                System.out.println(numberTwo);
                numberTwo= Integer.MIN_VALUE;
            } else if (numberTri>=numberOne&&numberTri>=numberTwo) {
                System.out.println(numberTri);
                numberTri = Integer.MIN_VALUE;
            }
        }
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class T11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numFirst = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double numSecond = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.##").format(calculate(numFirst,command,numSecond)));

    }
    public static double calculate (double numOne, String operator,double numTwo){
        double sum = 0.0;
        switch (operator){
            case "+":
                sum = numOne+numTwo;
                break;
            case  "-":
                sum = numOne-numTwo;
                break;
            case "*":
                sum = numOne*numTwo;
                break;
            case "/":
                sum = numOne/numTwo;
                break;
        }
        return sum;
    }
}

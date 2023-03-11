package TextProcessingExercise;

import java.util.Scanner;

public class T5MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());
        StringBuilder sum = new StringBuilder();
        int remainder = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            int currentNumber = Character.getNumericValue(number.charAt(i));
            int currentSum = currentNumber*numberTwo;
            currentSum+=remainder;
            if (currentSum/10!=0){
                remainder = currentSum/10;
            }else {
                remainder = 0;
            }
            sum.insert(0,currentSum%10);
        }
        if (remainder!=0){
            sum.insert(0,remainder);
        }
        StringBuilder sumFinal = new StringBuilder();
        for (int i = 0; i < sum.length()-1; i++) {
            if (Character.getNumericValue(sum.charAt(i))==0){
           sumFinal= new StringBuilder(sum.substring(i+1));
            }else {
                if (Character.getNumericValue(sum.charAt(0))!=0){
                    sumFinal = sum;
                }
                break;
            }
        }
        System.out.println(sumFinal);
    }
}

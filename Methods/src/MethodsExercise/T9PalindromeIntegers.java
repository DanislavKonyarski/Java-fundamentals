package MethodsExercise;

import java.util.Scanner;

public class T9PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")){
                System.out.println(palindromeNum(input));

            input = scanner.nextLine();
        }
    }
    public static boolean palindromeNum (String input){
        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i)!=input.charAt((input.length()-i)-1)){
                 return false;
            }
        }
        return true;
    }
}

package MethodsExercise;

import java.util.Scanner;

public class T4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean sixToTen = false;
        boolean letterNumber = false;
        boolean digit = false;
        if (sixToTenChars(password)){
            sixToTen = true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (letterDigit(password)){
            letterNumber = true;
        }else {
            System.out.println("Password must consist only of letters and digits");
        }
        if (twoDigit(password)){
            digit =true;
        }else {
            System.out.println("Password must have at least 2 digits");
        }
        if (sixToTen&&letterNumber&&digit){
            System.out.println("Password is valid");
        }
    }
    public static boolean sixToTenChars (String input){
        if (input.length()<6||input.length()>10){
            return false;
        }else {
            return true;
        }
    }
    public static boolean letterDigit (String input){
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym>=48&&sym<=57||sym>=65&&sym<=90||sym>=97&&sym<=122){
                continue;
            }else {
                return false;
            }
        }return true;
    }
    public static boolean twoDigit (String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (sym>=48&&sym<=57){
                count++;
            }
        }
        if (count>=2){
            return true;
        }else {
            return false;
        }
    }
}

package MethodsExercise;

import java.util.Scanner;

public class T10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        topInteger(input);
    }
    public static void topInteger (int num){
        for (int i = 10; i <= num; i++) {
            int sum = 0;
            int workI = i;
            while (workI!=0){
            sum += workI%10;
            workI= workI/10;
            }
            if (sum%8==0){
                if (oneOdd(i)){
                System.out.println(i);
                }
            }
        }
    }
    public static boolean oneOdd (int num){
        while (num!=0){
            int workNum = num%10;
            num/=10;
            if (workNum%2!=0){
                return true;
            }
        }return false;
    }

}

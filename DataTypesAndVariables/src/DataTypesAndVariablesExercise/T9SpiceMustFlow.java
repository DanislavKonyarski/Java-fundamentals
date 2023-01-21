package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yieldPerFirstDay = Integer.parseInt(scanner.nextLine());
        int sumYield = 0;
        int countDay = 0;
        while (yieldPerFirstDay>=100){
            sumYield+=yieldPerFirstDay;
            yieldPerFirstDay-=10;
            sumYield-=26;
            countDay++;
        }
        System.out.println(countDay);
        if (sumYield>=26){
        System.out.println(sumYield-26);
        }else {
            System.out.println(sumYield);
        }
    }
}

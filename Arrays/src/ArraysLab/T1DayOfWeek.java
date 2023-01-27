package ArraysLab;

import java.util.Scanner;

public class T1DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] dayWeekArr = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        if (input>=1&&input<=7){
            System.out.println(dayWeekArr[input-1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}

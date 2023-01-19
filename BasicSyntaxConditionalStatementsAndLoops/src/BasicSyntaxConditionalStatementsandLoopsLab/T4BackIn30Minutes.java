package BasicSyntaxConditionalStatementsandLoopsLab;

import java.util.Scanner;

public class T4BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newTime = (hour*60) + minutes + 30;
        int newHour = newTime/60;
        int newMinutes = newTime%60;
        if (newHour>23){
            newHour=0;
        }
        System.out.printf("%d:%02d",newHour,newMinutes);
    }
}

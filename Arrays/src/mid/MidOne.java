package mid;

import java.util.Scanner;

public class MidOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double experience = Double.parseDouble(scanner.nextLine());
        int countBattles = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countBattles; i++) {
            double experienceEarned = Double.parseDouble(scanner.nextLine());
            if (i % 3 == 0){
                experienceEarned = experienceEarned*1.15;
            }
            if (i % 5 == 0 ){
                experienceEarned *= 0.90;
            }
            if (i % 15 == 0){
                experienceEarned *= 1.05;
            }
            experience-=experienceEarned;
            if (experience<=0){
                System.out.printf("Player successfully collected his needed experience for %d battles.",i);
                break;
            }
        }
        if (experience>0){
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",experience);
        }
    }
}

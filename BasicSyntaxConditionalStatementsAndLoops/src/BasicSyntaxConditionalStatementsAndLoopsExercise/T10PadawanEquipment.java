package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class T10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        int freeBelt = students/6;
        double sum = (priceBelt * (students-freeBelt)) + (priceRobes*students) + (priceLightSaber*Math.ceil(students*1.1));
        if (money>=sum){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",sum-money);
        }
    }
}

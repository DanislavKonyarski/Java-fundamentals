import java.util.Scanner;

public class T5Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        switch (item) {
            case "coffee":
                coffee(count);
                break;
            case "water":
                water(count);
                break;
            case "coke":
                coke(count);
                break;
            case "snacks":
                snacks(count);
                break;
        }
    }

    public static void coffee(int count) {
        System.out.printf("%.2f", count * 1.5);
    }

    public static void water(int count) {
        System.out.printf("%.2f", count * 1.00);
    }

    public static void coke(int count) {
        System.out.printf("%.2f", count * 1.4);
    }

    public static void snacks(int count) {
        System.out.printf("%.2f", count * 2.0);
    }
}

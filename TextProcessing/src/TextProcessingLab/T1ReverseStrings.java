package TextProcessingLab;

import java.util.Scanner;

public class T1ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")){
            StringBuilder inputBuilder = new StringBuilder(input);
            System.out.println(input+" = "+inputBuilder.reverse());
            input = scanner.nextLine();
        }
    }
}

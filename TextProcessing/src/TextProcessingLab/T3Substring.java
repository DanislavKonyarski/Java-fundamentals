package TextProcessingLab;

import java.util.Scanner;

public class T3Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFirstLine = scanner.nextLine();
        String inputSecondLine = scanner.nextLine();
        while (inputSecondLine.contains(inputFirstLine)) {
            inputSecondLine= inputSecondLine.replace(inputFirstLine,"");
        }
        System.out.println(inputSecondLine);
    }
}

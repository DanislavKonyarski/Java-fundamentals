package TextProcessingLab;

import java.util.Scanner;

public class T2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        String finalString = "";
        for (int i = 0; i < inputArr.length; i++) {
            String word = inputArr[i];
            for (int j = 0; j < word.length() ; j++) {
                finalString += word;
            }
        }
        System.out.println(finalString);
    }
}

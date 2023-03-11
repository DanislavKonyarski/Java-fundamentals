package TextProcessingExercise;

import java.util.Scanner;

public class T2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int charSum = charSum(str1,str2);
        System.out.println(charSum);
    }

    public static Integer charSum(String str1, String str2) {
        int charSum = 0;
        if (str1.length() < str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                charSum += str1.charAt(i) * str2.charAt(i);
            }
            for (int i = str1.length() ; i < str2.length(); i++) {
                charSum += str2.charAt(i);
            }
        } else{
            for (int i = 0; i < str2.length(); i++) {
                charSum += str1.charAt(i) * str2.charAt(i);
            }
            for (int i = str2.length() ; i < str1.length(); i++) {
                charSum += str1.charAt(i);
            }
    }
        return charSum;
}
}

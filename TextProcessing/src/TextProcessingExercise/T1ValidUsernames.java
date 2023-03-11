package TextProcessingExercise;

import java.util.Scanner;

public class T1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLineArr = scanner.nextLine().split(", ");
        for (int i = 0; i < inputLineArr.length; i++) {
            boolean flag = false;
            String word = inputLineArr[i];
            if (word.length()>=3&&word.length()<=16){
                for (int j = 0; j < word.length(); j++) {
                    char symbol = word.charAt(j);
                    if (Character.isLetterOrDigit(symbol)||symbol=='_'||symbol=='-'){
                        flag = true;
                    }else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag){
                System.out.println(word);
            }
        }
    }
}

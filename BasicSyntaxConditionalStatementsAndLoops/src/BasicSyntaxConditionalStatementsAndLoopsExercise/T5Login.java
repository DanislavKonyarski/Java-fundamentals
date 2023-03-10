package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class T5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length(); i > 0 ; i--) {
            password = password + username.charAt(i-1);
        }
        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            if (input.equals(password)){
                System.out.printf("User %s logged in.%n",username);
                break;
            } else if (i==3) {
                System.out.printf("User %s blocked!%n",username);
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}

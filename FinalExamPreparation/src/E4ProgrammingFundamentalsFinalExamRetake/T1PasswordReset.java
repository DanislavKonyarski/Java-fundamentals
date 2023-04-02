package E4ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class T1PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Done")){
            String currentCommand = command.split("\\s+")[0];
            StringBuilder passwordSb = new StringBuilder();
            if (currentCommand.equals("TakeOdd")){
                for (int i = 1; i < password.length(); i+=2) {
                    passwordSb.append(password.charAt(i));
                }
                password = passwordSb.toString();
                System.out.println(password);
            } else if (currentCommand.equals("Cut")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);
                String currentString = password.substring(index,index+length);
                passwordSb.append(password);
                int firstIndex = passwordSb.indexOf(currentString);
                passwordSb.replace(firstIndex,firstIndex+length,"");
                password = passwordSb.toString();
                System.out.println(password);
            } else if (currentCommand.equals("Substitute")) {
                String substringOld = command.split("\\s+")[1];
                String substringNew = command.split("\\s+")[2];
                if (password.contains(substringOld)){
                    passwordSb = new StringBuilder(password);
                   password = passwordSb.toString().replace(substringOld,substringNew);
                    System.out.println(password);
                }else {
                    System.out.println("Nothing to replace!");
                }
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}

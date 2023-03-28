package E1ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class T1TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Decode")){
            String[] command = input.split("\\|");
            if (command[0].equals("Move")){
                int commandIndex = Integer.parseInt(command[1]);
                if (commandIndex>text.length()){
                    commandIndex=text.length();
                }
                String currentWord = text.substring(0,commandIndex);
                text.delete(0,commandIndex);
                text.append(currentWord);
            } else if (command[0].equals("Insert")) {
                int index = Integer.parseInt(command[1]);
                if (index>text.length()){
                    index = text.length();
                }
                String itemForInput = command[2];
                text.insert(index,itemForInput);
            } else if (command[0].equals("ChangeAll")) {
                String oldItemForReplace = command[1];
                String newItemForReplace = command[2];
                String currentText = text.toString();
                currentText = currentText.replace(oldItemForReplace,newItemForReplace);
                text.replace(0,text.length(),currentText);
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",text);
    }
}
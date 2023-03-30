package E3ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class T1SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputSB = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String currentString = inputSB.toString();
            switch (command.split(":\\|:")[0]) {
                case "InsertSpace":
                    inputSB.insert(Integer.parseInt(command.split(":\\|:")[1]), " ");
                    System.out.println(inputSB);
                    break;
                case "Reverse":
                    if (currentString.contains(command.split(":\\|:")[1])) {
                        int indexStart = inputSB.indexOf(command.split(":\\|:")[1]);
                        int indexEnd = command.split(":\\|:")[1].length() + indexStart;
                        StringBuilder currentStringSB = new StringBuilder(inputSB.substring(indexStart, indexEnd));
                        currentStringSB.reverse();
                        inputSB.replace(indexStart, indexEnd, currentStringSB.toString());
                        System.out.println(inputSB);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    if (currentString.contains(command.split(":\\|:")[1])){
                    while (currentString.contains(command.split(":\\|:")[1])) {
                        int indexOfOldString = inputSB.indexOf(command.split(":\\|:")[1]);
                        int indexOfOldStringLength = indexOfOldString + command.split(":\\|:")[1].length();
                        inputSB.replace(indexOfOldString, indexOfOldStringLength, command.split(":\\|:")[2]);
                        currentString = inputSB.toString();
                    }
                    System.out.println(inputSB);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", inputSB);
    }
}

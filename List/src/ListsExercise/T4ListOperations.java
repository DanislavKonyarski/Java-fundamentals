package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.split(" ")[0].equals("Add")){
                inputLine.add(Integer.parseInt(command.split(" ")[1]));
            } else if (command.startsWith("Insert")){
                if (Integer.parseInt(command.split(" ")[2])>inputLine.size()||Integer.parseInt(command.split(" ")[2])<0){
                    System.out.println("Invalid index");
                }else {
                inputLine.add(Integer.parseInt(command.split(" ")[2]),Integer.parseInt(command.split(" ")[1]));
                }
            } else if (command.startsWith("Remove")) {
                if (Integer.parseInt(command.split(" ")[1])>inputLine.size()||Integer.parseInt(command.split(" ")[1])<0){
                    System.out.println("Invalid index");
                }else {
                inputLine.remove(Integer.parseInt(command.split(" ")[1]));
                }
            } else if (command.startsWith("Shift left")) {
                for (int i = 0; i < Integer.parseInt(command.split(" ")[2]); i++) {
                    int currentNum = inputLine.get(0);
                    inputLine.remove(0);
                    inputLine.add(currentNum);
                }
            } else if (command.startsWith("Shift right")) {
                for (int i = 0; i < Integer.parseInt(command.split(" ")[2]); i++) {
                    int currentNum = inputLine.get(inputLine.size()-1);
                    inputLine.remove(inputLine.size()-1);
                    inputLine.add(0,currentNum);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(inputLine.toString().replaceAll("[\\[\\]\\,]",""));
    }
}

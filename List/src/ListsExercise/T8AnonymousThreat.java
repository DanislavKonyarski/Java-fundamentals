package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();
        while (!inputCommand.equals("3:1")) {
            String command = inputCommand.split(" ")[0];
            int commandPositionOne = Integer.parseInt(inputCommand.split(" ")[1]);
            int commandPositionTwo = Integer.parseInt(inputCommand.split(" ")[2]);
            switch (command) {
                case "merge":
                    if (commandPositionOne<0){
                        commandPositionOne=0;
                    }
                    if (commandPositionTwo>inputLine.size()){
                        commandPositionTwo=inputLine.size();
                    }
                    for (int i = commandPositionOne; i < commandPositionTwo; i++) {
                        if (commandPositionOne<=inputLine.size()&&commandPositionTwo>0) {
                            String currentStringOne = inputLine.get(commandPositionOne);
                            String currentStringTwo = inputLine.get(commandPositionOne + 1);
                            inputLine.remove(commandPositionOne);
                            inputLine.remove(commandPositionOne );
                            inputLine.add(commandPositionOne, currentStringOne + currentStringTwo);
                            inputLine.add("");
                        }
                    }
                    break;
                case "divide":
                    int index = commandPositionOne;
                    int partitions = commandPositionTwo;
                    if (index>=0&&index<=inputLine.size()-1) {
                        int numOfSymbol = inputLine.get(index).length()/partitions;
                        int countIte = inputLine.size()/numOfSymbol;
                        String currentStringDivide = inputLine.get(index);
                        inputLine.remove(index);
                        for (int i = 1; i < partitions; i++) {
                            String currentSym = currentStringDivide.substring(0,numOfSymbol);
                            inputLine.add(index-1+i,currentSym);
                            currentStringDivide = currentStringDivide.substring(numOfSymbol,currentStringDivide.length());
                        }
                        inputLine.add(index+partitions-1,currentStringDivide);
                    }
                    break;
            }
            inputCommand = scanner.nextLine();
        }
        System.out.println(inputLine.toString().replaceAll("[\\]\\[\\,]","").trim());
    }
}

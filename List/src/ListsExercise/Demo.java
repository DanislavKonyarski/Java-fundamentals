package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while (!commandList.get(0).equals("3:1")) {
            switch (commandList.get(0)) {
                case "merge":
                    int startIndex = Integer.parseInt(commandList.get(1));
                    int endIndex = Integer.parseInt(commandList.get(2));
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > inputLine.size()) {
                        endIndex = inputLine.size()-1 ;
                    }
                    String currentString = "";
                    if (startIndex < inputLine.size() - 1 && endIndex <= inputLine.size()-1) {
                        for (int i = startIndex; i <= endIndex; i++) {

                            currentString += inputLine.get(startIndex);
                            inputLine.remove(startIndex);
                        }
                        inputLine.add(startIndex, currentString);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(commandList.get(1));
                    int partitions = Integer.parseInt(commandList.get(2));
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
            commandList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        System.out.println(inputLine.toString().replaceAll("[\\[\\]\\,]", ""));
    }
}
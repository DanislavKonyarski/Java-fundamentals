package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shelfBooks = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.startsWith("Done")) {
            List<String> commandList = Arrays.stream(command.split("\\|")).collect(Collectors.toList());
            switch (commandList.get(0).trim()) {
                case "Add Book":
                    String nameBook = commandList.get(1).trim();
                    if (!shelfBooks.contains(nameBook)){
                        shelfBooks.add(0,commandList.get(1).trim());
                    }
                    break;
                case "Take Book":
                    String nameBookTake = commandList.get(1).trim();
                    if (shelfBooks.contains(nameBookTake)){
                        shelfBooks.remove(nameBookTake);
                    }
                    break;
                case "Swap Books":
                    String nameBookFirst = commandList.get(1).trim();
                    String nameBookSecond = commandList.get(2).trim();
                    if (shelfBooks.contains(nameBookFirst)&& shelfBooks.contains(nameBookSecond)){
                        int indexOne =  shelfBooks.indexOf(nameBookFirst);
                        int indexTwo = shelfBooks.indexOf(nameBookSecond);
                        shelfBooks.remove(nameBookFirst);
                        shelfBooks.remove(nameBookSecond);
                        shelfBooks.add(indexOne,nameBookSecond);
                        shelfBooks.add(indexTwo,nameBookFirst);
                    }
                    break;
                case "Insert Book":
                    String nameBookInsert = commandList.get(1).trim();
                    if (!shelfBooks.contains(nameBookInsert)){
                        shelfBooks.add(commandList.get(1).trim());
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(commandList.get(1).trim());
                    if (index>=0&&index<shelfBooks.size()){
                        System.out.println(shelfBooks.get(index).trim());
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(shelfBooks.toString().replaceAll("[\\]\\[]","").trim());
    }
}

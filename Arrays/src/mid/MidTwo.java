package mid;

import java.util.*;
import java.util.stream.Collectors;

public class MidTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> coffeeList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int countCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countCommands; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("Include")) {
                coffeeList.add(command.split(" ")[1]);
            } else if (command.startsWith("Remove")) {
                int countRemoveCoffee = Integer.parseInt(command.split(" ")[2]);
                if (countRemoveCoffee <= coffeeList.size()) {
                    if (command.split(" ")[1].equals("first")) {
                        for (int j = 0; j < countRemoveCoffee; j++) {
                            coffeeList.remove(0);
                        }
                    } else {
                        for (int j = 0; j < countRemoveCoffee; j++) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                }
            } else if (command.startsWith("Prefer")) {
                int indexOne = Integer.parseInt(command.split(" ")[1]);
                int indexTwo = Integer.parseInt(command.split(" ")[2]);
                if (indexOne<coffeeList.size()&&indexOne>=0&&indexTwo<coffeeList.size()&&indexTwo>=0){
                    Collections.swap(coffeeList,indexTwo,indexOne);
                }
            } else if (command.startsWith("Reverse")) {
                Collections.reverse(coffeeList);
            }
        }
        System.out.println("Coffees:");
        System.out.println(coffeeList.toString().replaceAll("[\\]\\[\\,]",""));
    }
}

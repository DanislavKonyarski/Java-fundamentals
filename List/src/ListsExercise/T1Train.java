package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityOnWagons = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.startsWith("Add")){
                wagons.add(Integer.parseInt(command.split(" ")[1]));
            }else {
                for (int i = 0; i < wagons.size(); i++) {
                    int currentNumber = Integer.parseInt(command.split(" ")[0]);
                    if (wagons.get(i)+currentNumber<=maxCapacityOnWagons){
                        wagons.set(i, wagons.get(i)+currentNumber);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]",""));
    }
}

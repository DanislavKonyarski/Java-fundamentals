package ListsExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.startsWith("Delete")){
                inputLine.removeAll(Arrays.asList(Integer.parseInt(command.split(" ")[1])));
            }
            if (command.startsWith("Insert")){
                inputLine.add(Integer.parseInt(command.split(" ")[2]),Integer.parseInt(command.split(" ")[1]));
            }
            command = scanner.nextLine();
        }
        System.out.println(inputLine.toString().replaceAll("[\\[\\]\\,]",""));
    }
}

package ListLab;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLis = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.startsWith("end")){
            if (command.startsWith("Add")){
                int currentNumber = Integer.parseInt(command.split(" ")[1]);
                inputLis.add(currentNumber);
            } else if (command.startsWith("RemoveAt")) {
                inputLis.remove(Integer.parseInt(command.split(" ")[1]));
            } else if (command.startsWith("Remove")) {
                inputLis.remove(Integer.valueOf(Integer.parseInt(command.split(" ")[1])));
            } else if (command.startsWith("Insert")) {
               inputLis.add(Integer.parseInt(command.split(" ")[2]),Integer.valueOf(Integer.parseInt(command.split(" ")[1])));
            }
            command = scanner.nextLine();
        }
        for (Integer inputLi : inputLis) {
            System.out.print(inputLi+" ");
        }
    }
}

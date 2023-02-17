package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().replaceAll("\\s+", " ").split("\\|")).collect(Collectors.toList());
        List<String> newList = new ArrayList<>();
        for (int i = inputLine.size() - 1; i >= 0; i--) {
            List<String> numbList = Arrays.stream(inputLine.get(i).trim().split("\\s+")).collect(Collectors.toList());
            for (String item : numbList) {
                newList.add(item);

            }
        }
        System.out.println(newList.toString().replaceAll("[\\[\\]\\,]"," ").replaceAll("\\s+"," "));
    }
}

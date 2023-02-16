package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLineFirst = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> inputLineSecond = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        while (inputLineFirst.size() != 0 && inputLineSecond.size() != 0) {
            int currentNumLineFirst = inputLineFirst.get(0);
            int currentNumLineSecond = inputLineSecond.get(0);
            inputLineFirst.remove(0);
            inputLineSecond.remove(0);
            if (currentNumLineFirst > currentNumLineSecond) {
                inputLineFirst.add(Integer.valueOf(currentNumLineFirst));
                inputLineFirst.add(Integer.valueOf(currentNumLineSecond));
            } else if (currentNumLineFirst == currentNumLineSecond) {
                continue;
            } else {
            inputLineSecond.add(Integer.valueOf(currentNumLineSecond));
                inputLineSecond.add(Integer.valueOf(currentNumLineFirst));
            }
        }
        if (inputLineFirst.size() > 0) {
            int sum = 0;
            for (Integer item : inputLineFirst) {
                sum += item;
            }
            System.out.println("First player wins! Sum: " + sum);
        } else {
            int sum = 0;
            for (Integer item : inputLineSecond) {
                sum += item;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}

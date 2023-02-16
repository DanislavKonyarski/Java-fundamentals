package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    private static java.util.stream.Collectors Collectors;
    private static java.util.Arrays Arrays;

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> numbersList = Arrays.stream(scan.nextLine()
            .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    List<Integer> inputList = Arrays.stream(scan.nextLine()
            .split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    int bombNumber = inputList.get(0);
    int power = inputList.get(1);

    for (int i = 0; i < numbersList.size(); i++) {
        int currentNumber = numbersList.get(i);

        if (currentNumber == bombNumber) {
            int currentIndex = i;
            int start = currentIndex - power;
            int finish = currentIndex + power;
            if (start < 0) {
                start = 0;
            }
            if (finish >= numbersList.size()) {
                finish = numbersList.size() - 1;
            }
            for (int j = start; j <= finish; j++) {
                numbersList.remove(start);
            }
        }
    }
    long sumOfListNumbers = 0;
    for (Integer number : numbersList) {
        sumOfListNumbers += number;

    }
    System.out.println(sumOfListNumbers);
}
}


package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> inputLine = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        for (int i = 0; i < inputLine.size()-1 ; i++) {
            int index = random.nextInt(inputLine.size()-1);
            if (!inputLine.get(i).equals(inputLine.get(index))){
                String workString = inputLine.get(index);
                inputLine.set(index,inputLine.get(i));
                inputLine.set(i,workString);
            }
        }
        for (String s : inputLine) {
            System.out.println(s);
        }
    }
}

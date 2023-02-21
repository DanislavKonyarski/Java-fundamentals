package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (inputLine.size() != 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int currentNumber = inputLine.get(0);
                inputLine.set(0, inputLine.get(inputLine.size() - 1));
                sum += currentNumber;
                for (int i = 0; i < inputLine.size(); i++) {
                    if (inputLine.get(i)<=currentNumber){
                        inputLine.set(i,inputLine.get(i)+currentNumber);
                    }else {
                        inputLine.set(i,inputLine.get(i)-currentNumber);
                    }
                }
            } else if (index>inputLine.size()-1) {
                int currentNumber = inputLine.get(inputLine.size()-1);
                inputLine.set(inputLine.size()-1,inputLine.get(0));
                sum+=currentNumber;
                for (int i = 0; i < inputLine.size(); i++) {
                    if (inputLine.get(i)<=currentNumber){
                        inputLine.set(i,inputLine.get(i)+currentNumber);
                    }else {
                        inputLine.set(i,inputLine.get(i)-currentNumber);
                    }
                }
            }else {
            int currentNumber = inputLine.get(index);
            inputLine.remove(index);
            sum+=currentNumber;
                for (int i = 0; i < inputLine.size(); i++) {
                    if (inputLine.get(i)<=currentNumber){
                        inputLine.set(i,inputLine.get(i)+currentNumber);
                    }else {
                        inputLine.set(i,inputLine.get(i)-currentNumber);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
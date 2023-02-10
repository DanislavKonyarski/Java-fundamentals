package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        int count = 0;
        int i = 0;
        while (count != numbers.size()-2) {
            if (numbers.get(i).equals(numbers.get(i+1))) {
                numbers.set(i,numbers.get(i)+numbers.get(i+1));
                numbers.remove(i+1);
                i = 0;
                count=0;
                continue;
            }
            count++;
            i++;
        }
        for (Double number : numbers) {
            System.out.print(new  DecimalFormat("0.#####").format(number)+" ");
        }
    }
}

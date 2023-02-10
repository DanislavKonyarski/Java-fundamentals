package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T2GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < number.size()-1; i++) {
            number.set(i,number.get(i)+number.get(number.size()-1));
            number.remove(number.size()-1);
        }
        System.out.println(number.toString().replace("[","").replace("]","").replace(",",""));;
    }
}

package ListLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < inputLine.size(); i++) {
            if (inputLine.get(i)<0){
                inputLine.remove(i);
                i--;
            }
        }
        if (inputLine.size()==0){
            System.out.println("empty");
        }else {
        Collections.reverse(inputLine);
        System.out.println(inputLine.toString().replace("[","").replace("]","").replace(",",""));
        }
    }
}
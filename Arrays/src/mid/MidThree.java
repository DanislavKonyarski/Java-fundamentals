package mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRating = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int position = Integer.parseInt(scanner.nextLine());
        String cheapOrExpensive = scanner.nextLine();
        List<Integer> leftList = priceRating.subList(0,position);
        List<Integer> rightList = priceRating.subList(position+1,priceRating.size());
        int numPosition = priceRating.get(position);
        long sumLeft = 0;
        long sumRight = 0;
        switch (cheapOrExpensive){
            case "cheap":
                for (Integer item : leftList) {
                    if (item<numPosition){
                        sumLeft+=item;
                    }
                }
                for (Integer item : rightList) {
                    if (item<numPosition){
                        sumRight+=item;
                    }
                }
                break;
            case "expensive":
                for (Integer item : leftList) {
                    if (item>=numPosition){
                        sumLeft+=item;
                    }
                }
                for (Integer item : rightList) {
                    if (item>=numPosition){
                        sumRight+=item;
                    }
                }
                break;
        }
        if (sumLeft>=sumRight){
            System.out.println("Left - "+sumLeft);
        }else {
            System.out.println("Right - "+sumRight);
        }
    }
}

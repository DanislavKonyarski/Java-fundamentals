package ListLab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T3MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lineOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> lineTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int biggerListSize = 0;
        List<Integer> finalList = new ArrayList<>();
        if (lineOne.size()>=lineTwo.size()){
            biggerListSize = lineOne.size();
        }else {
            biggerListSize = lineTwo.size();
        }
        for (int i = 0; i < biggerListSize ; i++) {
            if (lineOne.size()>i){
                finalList.add(lineOne.get(i));
            }
            if (lineTwo.size()>i){
                finalList.add(lineTwo.get(i));
            }
        }
        System.out.println(finalList.toString().replace("[","").replace("]","").replace(",",""));
    }
}

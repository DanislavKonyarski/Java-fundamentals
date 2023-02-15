package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputLine = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber =  Integer.parseInt(scanner.next());
        int rangeBomb = Integer.parseInt(scanner.next());
        int indexBomb = inputLine.indexOf(bombNumber);
        while (indexBomb != -1){
        int startSizeIputLine = inputLine.size();
            for (int i = indexBomb-rangeBomb; i <(indexBomb-rangeBomb)+(rangeBomb*2+1); i++) {
                if (i<0||startSizeIputLine<=i){
                    continue;
                }if (indexBomb-rangeBomb<0){
            inputLine.remove(0);
                }else {
                    inputLine.remove(indexBomb-rangeBomb);
                }
            }
            indexBomb = inputLine.indexOf(bombNumber);
        }
        int sum = 0;
        for (Integer item : inputLine) {
            sum+=item;
        }
        System.out.println(sum);
    }
}

package ArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chestTreasure = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "Loot":
                    for (int i = 1; i < commandArr.length; i++) {
                        if (chestTreasure.contains(commandArr[i])){
                            continue;
                        }else {
                            chestTreasure.add(0,commandArr[i]);
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(commandArr[1])<0||Integer.parseInt(commandArr[1])>chestTreasure.size()){
                    }else {
                    String currentItem = chestTreasure.get(Integer.parseInt(commandArr[1]));
                    chestTreasure.remove(Integer.parseInt(commandArr[1]));
                    chestTreasure.add(currentItem);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArr[1]);
                    if (count>=chestTreasure.size()){
                        count = chestTreasure.size();
                    }
                    List<String> stealList = new ArrayList<>();
                    for (int i = chestTreasure.size()-count; i < chestTreasure.size();) {
                        stealList.add(chestTreasure.get(i));
                        chestTreasure.remove(i);
                    }
                    System.out.println(stealList.toString().replaceAll("[\\]\\[]",""));
                    break;
            }
            command = scanner.nextLine();
        }
        if (chestTreasure.size()==0){
            System.out.println("Failed treasure hunt.");
        }else {
            double sum = 0;
            double count= 0;
            for (String item : chestTreasure) {
                sum += item.length();
                count++;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.",sum/count);
        }

    }
}

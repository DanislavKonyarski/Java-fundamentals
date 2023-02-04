package ArraysExercise;

import java.util.Scanner;

public class T10TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\|");
        String command = scanner.next();
        String workString = "";
        for (int i = 0; i < inputArr.length; i++) {
            workString += inputArr[i]+" ";
        }
        while (!"Yohoho!".equals(command)) {
            String[] workArr = workString.split(" ");
            switch (command) {
                case "Loot":
                 workString="";
                    String[] itemsArr = scanner.nextLine().split(" ");

                    for (int j = itemsArr.length - 1; j >= 1; j--) {
                        boolean flag = true;
                        for (int i = 0; i < workArr.length; i++) {
                            if (workArr[i].equals(itemsArr[j])) {
                                flag = false;
                            }
                        }
                        if (flag) {
                            workString += itemsArr[j] + " ";
                        }
                    }
                    for (int i = 0; i < workArr.length; i++) {
                        workString+=workArr[i]+" ";
                    }
                    workArr = workString.split(" ");
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(scanner.next());
                    if (dropIndex<=0||dropIndex>=workArr.length){
                        command = scanner.next();
                        continue;
                    }else {
                        String dropString = workArr[dropIndex];
                        for (int i = dropIndex; i < workArr.length; i++) {
                            if (workArr.length-1==i){
                                workArr[workArr.length-1]=dropString;
                            }else {
                                workArr[i]=workArr[i+1];
                            }
                        }
                    }
                    break;
                case "Steal":
                    workString = "";
                    String stealString = "";
                    int countSteal = Integer.parseInt(scanner.next());
                    if (countSteal>workArr.length){
                        countSteal= workArr.length;
                    }
                    for (int i = workArr.length-countSteal; i < workArr.length ; i++) {
                        stealString+=workArr[i]+" ";
                    }
                    String[] stealArr = stealString.split(" ");
                    System.out.print(String.join(", ",stealArr));
                    for (int i = 0; i < workArr.length-countSteal; i++) {
                        workString += workArr[i]+" ";
                    }
                    workArr = workString.split(" ");
                    break;

            }
            workString = "";
            for (int i = 0; i < workArr.length; i++) {
                workString += workArr[i]+" ";
            }
            command = scanner.next();
        }
        System.out.println();
        String finalArr[] = workString.split(" ");
        double sum = 0;
        for (int i = 0; i < finalArr.length; i++) {
            sum+=finalArr[i].length();
        }if (sum>0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", sum / finalArr.length);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputNumber = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.startsWith("end")){
            if (command.startsWith("Contains")){
                if (inputNumber.contains(Integer.parseInt(command.split(" ")[1]))){
                System.out.println("Yes");
                }else {
                    System.out.println("No such number");
                }
            } else if (command.startsWith("Print even")) {
                for (int i = 0; i < inputNumber.size(); i++) {
                    if (inputNumber.get(i)%2==0){
                        System.out.print(inputNumber.get(i)+" ");
                    }
                }
                System.out.println();
            } else if (command.startsWith("Print odd")) {
                for (int i = 0; i < inputNumber.size(); i++) {
                    if (inputNumber.get(i)%2!=0){
                        System.out.print(inputNumber.get(i)+" ");
                    }
                }
                System.out.println();
            } else if (command.startsWith("Get sum")) {
                int sum = 0;
                for (int i = 0; i < inputNumber.size(); i++) {
                    sum += inputNumber.get(i);
                }
                System.out.println(sum);
            } else if (command.startsWith("Filter")) {
                switch (command.split(" ")[1]){
                    case "<":
                        for (int i = 0; i < inputNumber.size(); i++) {
                            if (inputNumber.get(i)<Integer.parseInt(command.split(" ")[2])){
                                System.out.print(inputNumber.get(i)+" ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">":
                        for (int i = 0; i < inputNumber.size(); i++) {
                            if (inputNumber.get(i)>Integer.parseInt(command.split(" ")[2])){
                                System.out.print(inputNumber.get(i)+" ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":for (int i = 0; i < inputNumber.size(); i++) {
                        if (inputNumber.get(i)>=Integer.parseInt(command.split(" ")[2])){
                            System.out.print(inputNumber.get(i)+" ");
                        }
                    }
                        System.out.println();
                        break;
                    case "<=":
                        for (int i = 0; i < inputNumber.size(); i++) {
                            if (inputNumber.get(i)<=Integer.parseInt(command.split(" ")[2])){
                                System.out.print(inputNumber.get(i)+" ");
                            }
                        }
                        System.out.println();
                        break;
                }
            }
            command = scanner.nextLine();
        }
    }
}

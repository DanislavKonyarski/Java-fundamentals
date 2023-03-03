package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T2AMinerTask {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String,Integer> resursMap = new LinkedHashMap<>();
        while (!command.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resursMap.containsKey(command)){
                resursMap.put(command,resursMap.get(command)+quantity);
            }else {
                resursMap.put(command,quantity);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resursMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}

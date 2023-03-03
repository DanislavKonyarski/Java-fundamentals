package MapsLambdaAndStreamAPIExercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T4SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> dataBaseMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            switch (inputArr[0]){
                case "register":
                    if (dataBaseMap.containsKey(inputArr[1])){
                        System.out.println("ERROR: already registered with plate number "+dataBaseMap.get(inputArr[1]));
                    }else {
                        dataBaseMap.put(inputArr[1],inputArr[2]);
                        System.out.printf("%s registered %s successfully%n",inputArr[1],inputArr[2]);
                    }
                    break;
                case "unregister":
                    if (dataBaseMap.containsKey(inputArr[1])){
                        dataBaseMap.remove(inputArr[1]);
                        System.out.println(inputArr[1]+" unregistered successfully");
                    }else {
                        System.out.printf("ERROR: user %s not found%n",inputArr[1]);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : dataBaseMap.entrySet()) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

    }
}

package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T1CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLineArr = scanner.nextLine().split(" ");
        Map<Character,Integer> symbolCountMap = new LinkedHashMap<>();
        for (int i = 0; i < inputLineArr.length; i++) {
            String currentWord = inputLineArr[i];
            for (int j = 0; j < currentWord.length(); j++) {
                char symbol = currentWord.charAt(j);
                if (symbolCountMap.containsKey(symbol)){
                    symbolCountMap.put(symbol,symbolCountMap.get(symbol)+1);
                }else {
                    symbolCountMap.put(symbol,1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolCountMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}

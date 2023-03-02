package MapsLambdaAndStreamAPILab;

import java.util.*;

public class T2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> inputWordsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String firstWord = scanner.nextLine();
            String secondWord = scanner.nextLine();

            if (inputWordsMap.containsKey(firstWord)){
                inputWordsMap.get(firstWord).add(secondWord);
            }else {
                inputWordsMap.put(firstWord,new ArrayList<>());
                inputWordsMap.get(firstWord).add(secondWord);
            }
        }
        for (Map.Entry<String, List<String>> stringListEntry : inputWordsMap.entrySet()) {
            System.out.printf("%s - %s%n",stringListEntry.getKey(),String.join(", ",stringListEntry.getValue()));

        }

    }
}

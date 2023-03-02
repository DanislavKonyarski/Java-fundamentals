package MapsLambdaAndStreamAPILab;

import java.util.*;

public class T3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        Map<String, Integer> wordMap = new LinkedHashMap<>();
        for (int i = 0; i < inputArr.length; i++) {
            String wordLowCase = inputArr[i].toLowerCase();
            if (wordMap.containsKey(wordLowCase)) {
                wordMap.put(wordLowCase, wordMap.get(wordLowCase) + 1);
            } else {
                wordMap.put(wordLowCase, 1);
            }
        }
        List<String> currentList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                currentList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",currentList));
    }
}

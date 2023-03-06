package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> languageCountMap = new LinkedHashMap<>();
        Map<String, Integer> namePointsMap = new LinkedHashMap<>();
        while (!command.equals("exam finished")) {
            String[] inputLineArr = command.split("-");
            String name = inputLineArr[0];
            String language = inputLineArr[1];
            if (language.equals("banned")) {
                boolean flag = false;
                for (Map.Entry<String, Integer> entry : namePointsMap.entrySet()) {
                    if (entry.getKey().equals(name)) {
                        namePointsMap.remove(name);
                        flag = true;
                    }
                }
                if (flag) {
                    command = scanner.nextLine();
                    continue;
                }
            }
            int points = Integer.parseInt(inputLineArr[2]);
            if (!languageCountMap.containsKey(language)) {
                languageCountMap.put(language, 1);
            } else {
                languageCountMap.put(language, languageCountMap.get(language) + 1);
            }
            if (!namePointsMap.containsKey(name)) {
                namePointsMap.put(name, points);
            } else if (namePointsMap.get(name) < points) {
                namePointsMap.put(name, points);
            }
            command = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : namePointsMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

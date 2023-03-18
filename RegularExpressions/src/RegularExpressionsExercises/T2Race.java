package RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Map<String, Integer> nameMap = new LinkedHashMap();
        for (int i = 0; i < input.length; i++) {
            if (!nameMap.containsKey(input[i])) {
                nameMap.put(input[i], 0);
            }
        }
        String inputSymbols = scanner.nextLine();
        while (!inputSymbols.equals("end of race")) {
            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(inputSymbols);
            String name = "";
            while (matcher.find()) {
                name += matcher.group();
            }
            pattern = Pattern.compile("\\d");
            matcher = pattern.matcher(inputSymbols);
            int sum = 0;
            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }
            if (nameMap.containsKey(name)) {
                nameMap.put(name, nameMap.get(name) + sum);
            }
            inputSymbols = scanner.nextLine();
        }
        List<String> finalList = new ArrayList<>();
        for (int i = nameMap.size() - 1; i >= 0; i--) {
            int maxValue = (Collections.max(nameMap.values()));
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                if (entry.getValue()==maxValue){
                    finalList.add(entry.getKey());
                    break;
                }
            }
            nameMap.remove(finalList.get(finalList.size()-1));
        }
        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s",input[0],input[1],input[2]);
    }
}

package E3ProgrammingFundamentalsFinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T3PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPlant = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> plantMap = new LinkedHashMap<>();
        for (int i = 0; i < countPlant ; i++) {
            String input = scanner.nextLine();
            String plant = input.split("<->")[0];
            double rarity = Double.parseDouble(input.split("<->")[1]);
            if (!plantMap.containsKey(plant)){
                plantMap.put(plant,new ArrayList<>());
                plantMap.get(plant).add(rarity);
            }else {
                plantMap.get(plant).add(rarity);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            Pattern pattern = Pattern.compile("(?<command>[A-Za-z]+): (?<plant>\\w+)( - (?<rate>[0-9]+))?");
            Matcher matcher = pattern.matcher(command);
            String plant = "";
            double rate = 0;
            if (matcher.find()){
                command = matcher.group("command");
                plant = matcher.group("plant");

            }
            switch (command){
                case "Rate":
                    if (!plantMap.containsKey(plant)){
                        System.out.println("error");
                        break;
                    }
                    plantMap.get(plant).add(Double.parseDouble(matcher.group("rate")));
                    break;
                case "Update":
                    if (!plantMap.containsKey(plant)){
                        System.out.println("error");
                        break;
                    }
                    plantMap.get(plant).set(0,Double.parseDouble(matcher.group("rate")));
                    break;
                case "Reset":
                    if (!plantMap.containsKey(plant)){
                        System.out.println("error");
                        break;
                    }
                    int currentCount = plantMap.get(plant).size();
                    for (int i = 1; i < currentCount; i++) {
                        plantMap.get(plant).remove(1);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Double>> entry : plantMap.entrySet()) {
            double sum = 0;
            int count = 0;
            for (int i = 1; i < entry.getValue().size(); i++) {
                sum+= entry.getValue().get(i);
                count++;
            }
            double averageRating = sum/count;
            if (sum==0&&count==0){
                averageRating=0;
            }
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",entry.getKey(),entry.getValue().get(0),averageRating);
        }
    }
}

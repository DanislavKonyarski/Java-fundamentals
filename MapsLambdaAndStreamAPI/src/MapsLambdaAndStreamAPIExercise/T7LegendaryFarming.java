package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class T7LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> itemsMap = new LinkedHashMap<>();
        itemsMap.put("shards", 0);
        itemsMap.put("fragments", 0);
        itemsMap.put("motes", 0);

        while (true) {
            String[] inputArr = scanner.nextLine().split(" ");

            for (int i = 0; i < inputArr.length; i += 2) {
                String material = inputArr[i + 1].toLowerCase(Locale.ROOT);
                int quantity = Integer.parseInt(inputArr[i]);

                if (!itemsMap.containsKey(material)) {
                    itemsMap.put(material, quantity);
                } else {
                    itemsMap.put(material, itemsMap.get(material) + quantity);

                }
                if (itemsMap.get("shards") >= 250 || itemsMap.get("fragments") >= 250 || itemsMap.get("motes") >= 250) {
                    break;
                }
            }
            if (itemsMap.get("shards") >= 250 || itemsMap.get("fragments") >= 250 || itemsMap.get("motes") >= 250) {
                break;
            }
        }
        if (itemsMap.get("shards") >= 250) {
            itemsMap.put("shards", itemsMap.get("shards") - 250);
            System.out.println("Shadowmourne obtained!");
        } else if (itemsMap.get("fragments") >= 250) {
            itemsMap.put("fragments", itemsMap.get("fragments") - 250);
            System.out.println("Valanyr obtained!");
        } else if (itemsMap.get("motes") >= 250) {
            itemsMap.put("motes", itemsMap.get("motes") - 250);
            System.out.println("Dragonwrath obtained!");
        }
        int shards = itemsMap.get("shards");
        int fragments = itemsMap.get("fragments");
        int motes = itemsMap.get("motes");
        System.out.printf("shards: %d%nfragments: %d%nmotes: %d%n", shards, fragments, motes);
        for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
            if (entry.getKey().equals("shards") || entry.getKey().equals("fragments") || entry.getKey().equals("motes")) {
            } else {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

            }
        }

    }
}

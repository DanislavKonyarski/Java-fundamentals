package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class T9ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> forceMap = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String side = input.split(" \\| ")[0];
                String userName = input.split(" \\| ")[1];
                boolean flag = true;
                for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
                    if (entry.getValue().contains(userName)) {
                        flag = false;
                    }
                }
                if (!forceMap.containsKey(side) && flag) {
                    forceMap.put(side, new ArrayList<>());
                    forceMap.get(side).add(userName);
                } else if (forceMap.containsKey(side) && flag) {
                    forceMap.get(side).add(userName);
                }
            } else if (input.contains("->")) {
                String side = input.split(" -> ")[1];
                String userName = input.split(" -> ")[0];
                for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        if (entry.getValue().get(i).equals(userName)) {
                            entry.getValue().remove(i);
                        }
                    }
                }
                if (!forceMap.containsKey(side)) {
                    forceMap.put(side, new ArrayList<>());
                    forceMap.get(side).add(userName);
                } else {
                    forceMap.get(side).add(userName);
                }
                System.out.println(userName + " joins the " + side + " side!");
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : forceMap.entrySet()) {
            if (entry.getValue().size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println("! " + entry.getValue().get(i));
                }
            }
        }

    }
}

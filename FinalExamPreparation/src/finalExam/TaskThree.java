package finalExam;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMessage = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        Map<String, List<Integer>> userNameMap = new LinkedHashMap<>();
        while (!input.equals("Statistics")) {
            String command = input.split("=")[0];
            if (command.equals("Add")) {
                String userName = input.split("=")[1];
                int sent = Integer.parseInt(input.split("=")[2]);
                int received = Integer.parseInt(input.split("=")[3]);
                if (!userNameMap.containsKey(userName)) {
                    userNameMap.put(userName, new ArrayList<>());
                    userNameMap.get(userName).add(sent);
                    userNameMap.get(userName).add(received);
                } else {
                    input = scanner.nextLine();
                    continue;
                }
            } else if (command.equals("Message")) {
                String sender = input.split("=")[1];
                String received = input.split("=")[2];
                if (userNameMap.containsKey(sender) && userNameMap.containsKey(received)) {
                    if (userNameMap.get(sender).get(0) + userNameMap.get(sender).get(1)+1 < countMessage) {
                        userNameMap.get(sender).set(0, userNameMap.get(sender).get(0) + 1);
                    } else {
                        userNameMap.remove(sender);
                        System.out.printf("%s reached the capacity!%n",sender);
                    }
                    if (userNameMap.get(received).get(0) + userNameMap.get(received).get(1)+1 < countMessage) {
                        userNameMap.get(received).set(0, userNameMap.get(received).get(0) + 1);
                    } else {
                        userNameMap.remove(received);
                        System.out.printf("%s reached the capacity!%n",received);
                    }
                }
            } else if (command.equals("Empty")) {
                String userName = input.split("=")[1];
                if (userName.equals("All")){
                    userNameMap = new LinkedHashMap<>();
                }else {
                    userNameMap.remove(userName);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n",userNameMap.size());
        for (Map.Entry<String, List<Integer>> entry : userNameMap.entrySet()) {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue().get(0)+entry.getValue().get(1));
        }

    }
}

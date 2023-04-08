package finalExam;

import java.util.*;

public class T3MessagesManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String inputCommand = scanner.nextLine();
        Map<String, List<Integer>> userMp = new LinkedHashMap<>();
        while (!inputCommand.equals("Statistics")) {
            String command = inputCommand.split("=")[0];
            if (command.equals("Add")) {
                String user = inputCommand.split("=")[1];
                if (userMp.containsKey(user)) {
                    inputCommand = scanner.nextLine();
                    continue;
                } else {
                    userMp.put(user, new ArrayList<>());
                    userMp.get(user).add(Integer.parseInt(inputCommand.split("=")[2]));
                    userMp.get(user).add(Integer.parseInt(inputCommand.split("=")[3]));
                }
            } else if (command.equals("Message")) {
                if (userMp.containsKey(inputCommand.split("=")[1]) && userMp.containsKey(inputCommand.split("=")[2])) {
                    if (userMp.get(inputCommand.split("=")[1]).get(0) + userMp.get(inputCommand.split("=")[1]).get(1)+1 < count) {
                        userMp.get(inputCommand.split("=")[1]).set(0, userMp.get(inputCommand.split("=")[1]).get(0) + 1);
                    } else {
                        userMp.remove(inputCommand.split("=")[1]);
                        System.out.printf("%s reached the capacity!%n",inputCommand.split("=")[1]);
                    }
                    if (userMp.get(inputCommand.split("=")[2]).get(0) + userMp.get(inputCommand.split("=")[2]).get(1)+1 < count) {
                        userMp.get(inputCommand.split("=")[2]).set(0, userMp.get(inputCommand.split("=")[2]).get(0) + 1);
                    } else {
                        userMp.remove(inputCommand.split("=")[2]);
                        System.out.printf("%s reached the capacity!%n",inputCommand.split("=")[2]);
                    }
                }
            } else if (command.equals("Empty")) {
                if (inputCommand.split("=")[1].equals("All")){
                    userMp = new LinkedHashMap<>();
                }else {
                    userMp.remove(inputCommand.split("=")[1]);
                }
            }
            inputCommand = scanner.nextLine();
        }
        System.out.printf("Users count: %d%n",userMp.size());
        for (Map.Entry<String, List<Integer>> entry : userMp.entrySet()) {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue().get(0)+entry.getValue().get(1));
        }

    }
}


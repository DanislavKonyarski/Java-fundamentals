package E2ProgrammingFundamentalsFinalExam;

import java.util.*;

public class T3ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInput = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> favoritePieces = new LinkedHashMap<>();
        for (int i = 0; i <countInput; i++) {
            String input = scanner.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];
            if (!favoritePieces.containsKey(piece)){
                favoritePieces.put(piece,new ArrayList<>());
                favoritePieces.get(piece).add(composer);
                favoritePieces.get(piece).add(key);
            }else {
                favoritePieces.get(piece).add(composer);
                favoritePieces.get(piece).add(key);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            switch (command.split("\\|")[0]){
                case "Add":
                    if (!favoritePieces.containsKey(command.split("\\|")[1])){
                        favoritePieces.put(command.split("\\|")[1],new ArrayList<>());
                        favoritePieces.get(command.split("\\|")[1]).add(command.split("\\|")[2]);
                        favoritePieces.get(command.split("\\|")[1]).add(command.split("\\|")[3]);
                        System.out.println(command.split("\\|")[1]+" by "+command.split("\\|")[2]+
                                " in "+command.split("\\|")[3]+" added to the collection!");
                    }else {
                        System.out.println(command.split("\\|")[1]+" is already in the collection!");
                    }
                    break;
                case "Remove":
                    if (favoritePieces.containsKey(command.split("\\|")[1])){
                        favoritePieces.remove(command.split("\\|")[1]);
                        System.out.println("Successfully removed "+command.split("\\|")[1]+"!");
                    }else {
                        System.out.println("Invalid operation! "+command.split("\\|")[1]+" does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    if (favoritePieces.containsKey(command.split("\\|")[1])){
                        favoritePieces.get(command.split("\\|")[1]).set(1,command.split("\\|")[2]);
                        System.out.println("Changed the key of "+command.split("\\|")[1]+" to "+command.split("\\|")[2]+"!");
                    }else {
                        System.out.println("Invalid operation! "+command.split("\\|")[1]+" does not exist in the collection.");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : favoritePieces.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}

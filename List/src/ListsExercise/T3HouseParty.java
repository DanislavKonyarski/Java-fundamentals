package ListsExercise;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInputs = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < numberInputs; i++) {
            String input = scanner.nextLine();
            if (input.split(" ")[2].equals("not")){
                if (guests.contains(input.split(" ")[0])){
                    guests.remove(input.split(" ")[0]);
                }else {
                    System.out.println(input.split(" ")[0]+" is not in the list!");
                }
            }else {
                if (guests.contains(input.split(" ")[0])){
                    System.out.println(input.split(" ")[0]+" is already in the list!");
                }else {
                guests.add(input.split(" ")[0]);
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}

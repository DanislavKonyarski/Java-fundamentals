package RegularExpressionsExercises;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T4StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInputLine = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        for (int i = 0; i < countInputLine; i++) {
            String input = scanner.nextLine();
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.toLowerCase().charAt(j) == 's' || input.toLowerCase().charAt(j) == 't' ||
                        input.toLowerCase().charAt(j) == 'a' || input.toLowerCase().charAt(j) == 'r') {
                    count++;
                }
            }
            StringBuilder currentInput = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                currentInput.append((char) (input.charAt(j)-count));
            }
            input = currentInput.toString();
            Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<planetPopulation>\\d+)[^@\\-!:>]*![^@\\-!:>]*(?<command>[A,D])[^@\\-!:>]*![^@\\-!:>]*->[^@\\-!:>]*(?<soldiercount>\\d*)");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                if (matcher.group("command").equals("A")){
                    attacked.add(matcher.group("planetName"));
                } else if (matcher.group("command").equals("D")) {
                    destroyed.add(matcher.group("planetName"));
                }else {
                    break;
                }
            }
        }

        Collections.sort(attacked);
        System.out.printf("Attacked planets: %d%n",attacked.size());
        for (int i = 0; i < attacked.size(); i++) {
            System.out.printf("-> %s%n",attacked.get(i));
        }
        Collections.sort(destroyed);
        System.out.printf("Destroyed planets: %d%n",destroyed.size());
        for (int i = 0; i < destroyed.size(); i++) {
            System.out.printf("-> %s%n",destroyed.get(i));
        }
    }
}

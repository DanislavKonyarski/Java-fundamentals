package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T5NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",\\s*");
        for (int i = 0; i < input.length; i++) {
            input[i]= input[i].replaceAll(" ","");
            Pattern pattern = Pattern.compile("[^0-9\\-.*/+]");
            Matcher matcher = pattern.matcher(input[i]);
            String symbolHealth = "";
            while (matcher.find()) {
                symbolHealth += matcher.group();
            }
            int health = 0;
            for (int j = 0; j < symbolHealth.length(); j++) {
                health += symbolHealth.charAt(j);
            }
            double damage = 0;
            pattern = Pattern.compile("[-,+]*[0-9]+\\.*[0-9]*");
            matcher = pattern.matcher(input[i]);
            while (matcher.find()) {
                damage += Double.parseDouble(matcher.group());
            }
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == '*') {
                    damage *= 2;
                } else if (input[i].charAt(j) == '/') {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", input[i], health, damage);
        }
    }
}
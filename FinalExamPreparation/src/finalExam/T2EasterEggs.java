package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Pattern pattern = Pattern.compile("[#@]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*[\\/]+(?<amount>[0-9]+)[\\/]");
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()){
            int amountEggs = Integer.parseInt(matcher.group("amount"));
            String color = matcher.group("color");
            System.out.printf("You found %s %s eggs!%n",amountEggs,color);
        }
    }
}

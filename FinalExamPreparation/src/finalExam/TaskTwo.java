package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[#@]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*[\\/]+(?<count>[0-9]+)[\\/]");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.printf("You found %s %s eggs!%n",matcher.group("count"),matcher.group("color"));
        }
    }
}

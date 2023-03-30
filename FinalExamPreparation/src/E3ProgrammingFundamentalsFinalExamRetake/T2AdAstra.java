package E3ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([#]|[\\|])(?<name>[A-Za-z ]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> name = new ArrayList<>();
        List<String> date = new ArrayList<>();
        List<String> calories = new ArrayList<>();
        int sum = 0;
        while (matcher.find()){
            name.add(matcher.group("name"));
            date.add(matcher.group("date"));
            calories.add(matcher.group("calories"));
        }
        for (int i = 0; i < calories.size(); i++) {
            int caloriesInt = Integer.parseInt(calories.get(i));
            sum+=caloriesInt;
        }
        System.out.printf("You have food to last you for: %d days!%n",sum/2000);
        for (int i = 0; i < name.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",name.get(i),date.get(i),calories.get(i));
        }
    }
}

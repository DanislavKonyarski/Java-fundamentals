package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Bought furniture:");
        double sum = 0;
        while (!input.equals("Purchase")){
        Pattern pattern = Pattern.compile(">>(?<furniture>\\w+)<<(?<price>[0-9]+.?\\d*)!(?<count>\\d+)\\b");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) {
            String furniture = matcher.group("furniture");
            double price = Double.parseDouble(matcher.group("price"));
            int count = Integer.parseInt(matcher.group("count"));
            sum += price*count;
            System.out.println(furniture);
        }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}

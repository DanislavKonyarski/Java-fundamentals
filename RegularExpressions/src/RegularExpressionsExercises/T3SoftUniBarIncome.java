package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T3SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+.\\d*)\\$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String customerName = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += count * price;
                System.out.printf("%s: %s - %.2f%n", customerName, product, price * count);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", sum);
    }
}
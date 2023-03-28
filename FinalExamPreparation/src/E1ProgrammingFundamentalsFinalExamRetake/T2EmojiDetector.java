package E1ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(input);
        int sum = 1;
        while (matcher.find()){
            sum*=Integer.parseInt(matcher.group());
        }
        pattern = Pattern.compile("(?<emoji>([:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})\\2)");
        matcher = pattern.matcher(input);
        int count = 0;
        List<String> coolnessEmojiList = new ArrayList<>();
        while (matcher.find()){
            count++;
            int coolness = 0;
            String nameEmoji = matcher.group("name");
            for (int i = 0; i < nameEmoji.length(); i++) {
                coolness+=nameEmoji.charAt(i);
            }
            if (coolness>=sum){
                coolnessEmojiList.add(matcher.group("emoji"));
            }
        }
        System.out.printf("Cool threshold: %d%n" +
                "%d emojis found in the text. The cool ones are:%n",sum,count);
        for (String item : coolnessEmojiList) {
            System.out.println(item);
        }
    }
}

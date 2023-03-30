package E2ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        List<String> mirrorWords = new ArrayList<>();
        while (matcher.find()) {
            count++;
            boolean flag = false;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder reversedWord = new StringBuilder(wordTwo);
            if (wordOne.length() == wordTwo.length()) {
                if (wordOne.equals(reversedWord.reverse().toString())) {
                    flag = true;
                }
            }
            if (flag){
                mirrorWords.add(wordOne);
                mirrorWords.add(wordTwo);
            }
        }
        if (count!=0){
            System.out.println(count+" word pairs found!");
        }else {
            System.out.println("No word pairs found!");
        }
        if (mirrorWords.size()!=0){
            System.out.println("The mirror words are:");
            for (int i = 0; i < mirrorWords.size(); i+=2) {
                if (mirrorWords.size()-2==i){
                    System.out.printf("%s <=> %s",mirrorWords.get(i),mirrorWords.get(i+1));
                }else {
                System.out.printf("%s <=> %s, ",mirrorWords.get(i),mirrorWords.get(i+1));
                }
            }
        }else {
            System.out.println("No mirror words!");
        }
    }
}

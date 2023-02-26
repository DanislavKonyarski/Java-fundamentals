package ObjectsAndClassesExercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T1AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Random text = new Random();
        String[] phrases = {"Excellent product.","Such a great product.","I always use that product.","Best product of its category.",
                "Exceptional product.","I can’t live without this product."};
        String[] events = {"Now I feel good.","I have succeeded with this product.","Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!"};
        String[] authors = {"Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva"};
        String[] cities = {"Burgas","Sofia","Plovdiv","Varna","Ruse"};
        for (int i = 0; i < count; i++) {
            int indexPhrases = text.nextInt(phrases.length);
            int indexEvents  = text.nextInt(events.length);
            int indexAuthors = text.nextInt(authors.length);
            int indexCities = text.nextInt(cities.length);
            System.out.println(phrases[indexPhrases]+events[indexEvents]+authors[indexAuthors]+"-"+cities[indexCities]);
        }
    }
}

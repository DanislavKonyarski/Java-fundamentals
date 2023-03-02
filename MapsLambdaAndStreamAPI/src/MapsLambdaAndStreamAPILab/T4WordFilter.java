package MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class T4WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = Arrays.stream(scanner.nextLine().split(" ")).filter(e -> e.length()%2==0).toArray(String[]::new);

    }
}

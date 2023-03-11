package TextProcessingExercise;

import java.util.List;
import java.util.Scanner;

public class T3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String[] nameAndExtension = input[input.length-1].split("\\.");
        System.out.printf("File name: %s%nFile extension: %s",nameAndExtension[0],nameAndExtension[1]);
    }
}

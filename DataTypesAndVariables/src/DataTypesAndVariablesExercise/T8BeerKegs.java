package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class T8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKegs = Integer.parseInt(scanner.nextLine());
        double volume = 0.0;
        double workVolume = 0.0;
        String biggestKeg = "";
        for (int i = 0; i < countKegs; i++) {
            String modelKegs = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            workVolume = Math.PI * Math.pow(radius, 2) * height;
            if (workVolume > volume) {
                volume = workVolume;
                biggestKeg = modelKegs;
            }
        }
        System.out.println(biggestKeg);
    }
}

package DataTypesAndVariablesMoreExercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class T1DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Integer
        //Floating point
        //Strings

        while (!"END".equals(input)) {
            boolean floatingPoint = false;
            boolean strings = false;
            boolean integer = false;
            int count=0;
            if ("false".equalsIgnoreCase(input) || "true".equalsIgnoreCase(input)) {
                System.out.printf("%s is boolean type%n", input);
                input = scanner.nextLine();
                continue;
            } else if (input.length()==1){
                if (input.charAt(0)>=48&&input.charAt(0)<=57){
                    System.out.printf("%s is integer type%n", input);
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.printf("%s is character type%n", input);
                    input = scanner.nextLine();
                    continue;
                }
            }
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                if (i!=0&&symbol==46){
                    floatingPoint = true;
                    count++;
                } else if (symbol>=48&&symbol<=57||symbol==45&i==0||symbol==43&i==0) {
                    integer = true;
                } else{
                    strings = true;
                }
            } if (!strings&&integer&&count==0){
                System.out.printf("%s is integer type%n", input);
            } else if (!strings&&floatingPoint&&count==1) {
                System.out.printf("%s is floating point type%n", input);
            }else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}

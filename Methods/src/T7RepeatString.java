import java.util.Scanner;

public class T7RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input,countRepeat));
    }
    public static String repeatString (String input, int count){
        String workString = "";
        for (int i = 0; i < count; i++) {
            workString +=input;
        }
        return workString;
    }
}

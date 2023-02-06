import java.util.Scanner;

public class T4Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int numFirst = Integer.parseInt(scanner.nextLine());
        int numSecond = Integer.parseInt(scanner.nextLine());
        switch (command){
            case "add":
                add(numFirst,numSecond);
                break;
            case "multiply":
                multiply(numFirst,numSecond);
                break;
            case "subtract":
                subtract(numFirst,numSecond);
                break;
            case "divide":
                divide(numFirst,numSecond);
                break;
        }
    }
    public static void add (int numOne,int numTwo){
        System.out.printf("%d",numTwo+numOne);
    }
    public static void multiply(int numOne, int numTwo){
        System.out.printf("%d",numTwo*numOne);
    }
    public static void subtract (int numOne, int numTwo){
        System.out.printf("%d",numOne-numTwo);
    }
    public static void divide (int numOne, int numTwo){
        System.out.printf("%d",numOne/numTwo);
    }
}

import java.util.Scanner;

public class T6CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = rectangleArea(a,b);
        System.out.printf("%.0f",area);
    }
    public static double rectangleArea  (double a, double b){
        double area = a*b;
        return area;
    }
}
